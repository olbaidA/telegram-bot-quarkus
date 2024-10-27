package com.olbaid.telegram;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olbaid.telegram.getter.TelegramMessagePhoto;
import com.olbaid.telegram.getter.TelegramMessageRandomYesNo;
import com.olbaid.telegram.model.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * TelegramOperation
 * Author: Olbaid
 */
public abstract class TelegramOperation {

    private static final Logger LOG = LoggerFactory.getLogger(TelegramOperation.class);

    @Inject
    TelegramOperationOutput telegramOperationOutput;

    private final Map<String, Set<Integer>> processedMessageIds = new HashMap<>();
    private final Map<String, Set<String>> processedCallbackIds = new HashMap<>();

    public void handleResponse(Response response, String errorMessage) {
        try {
             String jsonResponse = response.readEntity(String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);
            LOG.debug("TelegramOperationInput response: {}", jsonNode);

            if (!jsonNode.get("ok").asBoolean()) {
                LOG.error(errorMessage);
                return;
            }

            JsonNode resultNode = jsonNode.get("result");
            if (resultNode.isArray()) {
                List<Update> updates = objectMapper.readValue(resultNode.toString(), objectMapper.getTypeFactory().constructCollectionType(List.class, Update.class));
                for (Update update : updates) {
                    if (update.getCallbackQuery() != null) {
                        processCallbackQuery(update.getCallbackQuery());
                    } else {
                        processMessage(update.getMessage());
                    }
                }
            } else if (resultNode.isObject()) {
                MessageExt message = objectMapper.readValue(resultNode.toString(), MessageExt.class);
                processMessage(message);
            }
        } catch (Exception e) {
            LOG.error("Failed to parse JSON response!", e);
        }
    }

    private void processMessage(MessageExt message) {
        if (message != null) {
            Long messageFromId = message.getFrom().getId();
            Long messageChatId = message.getChat().getId();
            Integer messageId = message.getMessageId();
            Integer messageDate = message.getDate();

            if (messageDate < (System.currentTimeMillis() / 1000L) - 60) {
//                LOG.debug("Message ID {} is older than 60 seconds.", messageId);
                return;
            }

            if (processedMessageIds.computeIfAbsent(messageFromId.toString(), k -> new HashSet<>()).contains(messageId)) {
//                LOG.debug("Message ID {} already processed.", messageId);
                return;
            }

            String command = message.getText();
            if (command != null && command.startsWith("/")) {
                LOG.info("Received command: {} at {}", command, new Date(messageDate * 1000L));
                executeCommand(command, messageChatId);
                processedMessageIds.get(messageFromId.toString()).add(messageId);
            }
        }
    }

    private void processCallbackQuery(CallbackQuery callbackQuery) {
        String callbackId = callbackQuery.getId();
        Long callbackFromId = callbackQuery.getFrom().getId();
        String callbackData = callbackQuery.getData();
        Long chatId = callbackQuery.getMessage().getChat().getId();

        if (processedCallbackIds.computeIfAbsent(callbackFromId.toString(), k -> new HashSet<>()).contains(callbackId)) {
//            LOG.debug("Callback ID {} already processed.", callbackId);
            return;
        }

        switch (callbackData) {
            case "callback_1":
                TelegramMessagePhoto messagePhoto = new TelegramMessagePhoto();
                telegramOperationOutput.sendPhoto(messagePhoto.getObject(), chatId);
                break;
            case "callback_2":
                telegramOperationOutput.sendMessage("Button 2 clicked!", chatId);
                break;
            default:
                LOG.warn("Unknown callback data: {}", callbackData);
        }

        processedCallbackIds.get(callbackFromId.toString()).add(callbackId);
    }

    private void executeCommand(String command, Long chatId) {
        switch (command) {
            case "/start":
                telegramOperationOutput.sendMessage("Welcome to the Telegram bot!", chatId);
                break;
            case "/stop":
                telegramOperationOutput.sendMessage("Goodbye!", chatId);
                break;
            case "/photo":
                TelegramMessagePhoto messagePhoto = new TelegramMessagePhoto();
                telegramOperationOutput.sendPhoto(messagePhoto.getObject(), chatId);
                break;
            case "/chenepensi":
                TelegramMessageRandomYesNo messageRandomYesNo = new TelegramMessageRandomYesNo();
                telegramOperationOutput.sendAnimation(messageRandomYesNo.getObject(), chatId);
                break;
            case "/buttons":
                InlineKeyboardButton button1 = new InlineKeyboardButton("Photo", "callback_1");
                InlineKeyboardButton button2 = new InlineKeyboardButton("Pulsante 2", "callback_2");
                InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(
                        Arrays.asList(
                                Arrays.asList(button1, button2)
                        )
                );
                telegramOperationOutput.sendMessageWithInlineKeyboard("Choose an option:", chatId, inlineKeyboardMarkup);
                break;
            case "/customkeyboard":
                KeyboardButton buttonA = new KeyboardButton("Option A");
                KeyboardButton buttonB = new KeyboardButton("Option B");
                List<KeyboardButton> row1 = Arrays.asList(buttonA, buttonB);
                List<List<KeyboardButton>> keyboard = Arrays.asList(row1);
                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup(keyboard, true, true, false);
                telegramOperationOutput.sendMessageWithReplyKeyboard("Choose an option:", chatId, replyKeyboardMarkup);
                break;
        }
    }
}