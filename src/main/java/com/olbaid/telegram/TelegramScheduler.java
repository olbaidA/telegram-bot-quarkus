package com.olbaid.telegram;

import com.olbaid.telegram.getter.TelegramMessageGetter;
import com.olbaid.telegram.model.BotCommand;
import com.olbaid.telegram.model.BotCommandScopeChatAdministrators;
import com.olbaid.telegram.model.BotCommandScopeDefault;
import io.quarkus.scheduler.Scheduled;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TelegramScheduler
 * Author: Olbaid
 */
@ApplicationScoped
public class TelegramScheduler {

	private static final Logger LOG = LoggerFactory.getLogger(TelegramScheduler.class);

	@Inject
	private TelegramOperationInput telegramOperationInput;

	@Inject
	private TelegramOperationOutput telegramOperationOutput;

	@Inject
	private Instance<TelegramMessageGetter> messageGetter;

	@ConfigProperty(name = "telegram.chatId")
	private Long chatId;

	@PostConstruct
	public void init() {
		BotCommand[] commandsDefault = {
				new BotCommand("start", "Start the bot"),
				new BotCommand("stop", "Stop the bot"),
				new BotCommand("photo", "Send a photo"),
				new BotCommand("chenepensi", "Send a random yes/no animation"),
				new BotCommand("buttons", "View buttons"),
		};
		BotCommandScopeDefault scopeDefault = new BotCommandScopeDefault();
		BotCommand[] commandsAdministration = {
				new BotCommand("customkeyboard", "View custom keyboard")
		};
		//TODO: refactoring chatid = Gabriele
		BotCommandScopeChatAdministrators scopeAdmin = new BotCommandScopeChatAdministrators("161252687");
		telegramOperationOutput.setMyCommands(commandsDefault, scopeDefault);
		telegramOperationOutput.setMyCommands(commandsAdministration, scopeAdmin);
		LOG.info("TelegramScheduler initialized");
	}

	@Scheduled(every = "1s")
	public void sendQueryResults() {
//		if(messageGetter.get().getObject() instanceof Photo) {
//			Photo photo = (Photo) messageGetter.get().getObject();
//			service.sendPhoto(photo, chatId);
//		}
//		else if ( messageGetter.get().getObject() instanceof String ) {
//			service.sendMessage((String) messageGetter.get().getObject(), chatId);
//		}
		telegramOperationInput.getUpdates();
	}

}
