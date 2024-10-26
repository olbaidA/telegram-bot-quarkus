package com.olbaid.telegram;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.olbaid.telegram.getter.model.Media;
import com.olbaid.telegram.model.BotCommand;
import com.olbaid.telegram.model.BotCommandScope;
import com.olbaid.telegram.model.InlineKeyboardMarkup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;

/**
 * TelegramOperationOutput
 * Author: Olbaid
 */
@ApplicationScoped
public class TelegramOperationOutput {

    private static final Logger LOG = LoggerFactory.getLogger(TelegramOperationOutput.class);

    @Inject
    private TelegramClient telegramClient;

    public void sendMessage(String messageRequest, Long chatId) {
        Response response = telegramClient.getBaseTarget().path("sendMessage")
                .queryParam("chat_id", chatId)
                .queryParam("text", messageRequest)
                .request()
                .get();

        handleResponse(response, "Send message failed!");
    }

    public void sendPhoto(Media photo, Long chatId) {
        sendGenericMedia(photo, "photo", "sendPhoto", chatId);
    }

    public void sendAnimation(Media animation, Long chatId) {
        sendGenericMedia(animation, "animation", "sendAnimation", chatId);
    }

    public void setBotName(String botName) {
        String jsonPayload = String.format("{\"name\":\"%s\"}", botName);
        Response response = telegramClient.getBaseTarget().path("setMyCommands")
                .request()
                .post(Entity.json(jsonPayload));

        handleResponse(response, "Set bot name failed!");
    }

    public void setMyCommands(BotCommand[] commands, BotCommandScope scope) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ArrayNode commandsArray = objectMapper.createArrayNode();
            for (BotCommand command : commands) {
                ObjectNode commandObject = objectMapper.createObjectNode();
                commandObject.put("command", command.getCommand());
                commandObject.put("description", command.getDescription());
                commandsArray.add(commandObject);
            }
            ObjectNode payload = objectMapper.createObjectNode();
            payload.set("commands", commandsArray);
            payload.set("scope", objectMapper.valueToTree(scope));

            Response response = telegramClient.getBaseTarget().path("setMyCommands")
                    .request()
                    .post(Entity.json(payload.toString()));

            handleResponse(response, "Set bot commands failed!");
        } catch (Exception e) {
            LOG.error("Failed to set bot commands!", e);
        }
    }

    public void sendMessageWithInlineKeyboard(String messageRequest, Long chatId, InlineKeyboardMarkup inlineKeyboardMarkup) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectNode payload = objectMapper.createObjectNode();
            payload.put("chat_id", chatId);
            payload.put("text", messageRequest);
            payload.set("reply_markup", objectMapper.valueToTree(inlineKeyboardMarkup));

            LOG.debug("Payload JSON: " + payload.toString());

            Response response = telegramClient.getBaseTarget().path("sendMessage")
                    .request()
                    .post(Entity.json(payload.toString()));

            handleResponse(response, "Send message with inline keyboard failed!");
        } catch (Exception e) {
            LOG.error("Failed to send message with inline keyboard!", e);
        }
    }

    private void sendGenericMedia(Media media, String formDataName, String methodName, Long chatId) {
        MultipartFormDataOutput request = new MultipartFormDataOutput();
        request.addFormData("chat_id", chatId, jakarta.ws.rs.core.MediaType.TEXT_PLAIN_TYPE);
        request.addFormData("caption", media.getCaption(), jakarta.ws.rs.core.MediaType.TEXT_PLAIN_TYPE);

        if (media.getType() == Media.MediaType.PATH) {
            File mediaFile = new File(media.getPath());
            if (!mediaFile.exists()) {
                LOG.error("Media file does not exist: " + media.getPath());
                return;
            }
            try (FileInputStream fileInputStream = new FileInputStream(mediaFile)) {
                request.addFormData(formDataName, fileInputStream, jakarta.ws.rs.core.MediaType.APPLICATION_OCTET_STREAM_TYPE, mediaFile.getName());
                sendGenericMediaRequest(request, methodName);
            } catch (Exception e) {
                LOG.error("Failed to send media!", e);
            }
        } else if (media.getType() == Media.MediaType.ID) {
            request.addFormData(formDataName, media.getIdOrUrl(), jakarta.ws.rs.core.MediaType.TEXT_PLAIN_TYPE);
            sendGenericMediaRequest(request, methodName);
        }
    }

    private void sendGenericMediaRequest(MultipartFormDataOutput request, String methodName) {
        Response response = telegramClient.getBaseTarget().path(methodName)
                .request()
                .post(Entity.entity(request, jakarta.ws.rs.core.MediaType.MULTIPART_FORM_DATA_TYPE));
        handleResponse(response, "Send media failed!");
    }

    private void handleResponse(Response response, String errorMessage) {
        try {
            String jsonResponse = response.readEntity(String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);
            LOG.debug("TelegramOperationOutput response: " + jsonResponse);

            if (!jsonNode.get("ok").asBoolean()) {
                LOG.error(errorMessage);
            }

        } catch (Exception e) {
            LOG.error("Failed to parse JSON response!", e);
        }
    }
}