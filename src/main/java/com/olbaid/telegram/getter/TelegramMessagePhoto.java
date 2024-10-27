package com.olbaid.telegram.getter;

import com.olbaid.telegram.getter.model.Media;
import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@LookupIfProperty(name = "telegram.message.impl", stringValue = "photo")
@ApplicationScoped
public class TelegramMessagePhoto implements TelegramMessageGetter {

	private static final Logger LOG = LoggerFactory.getLogger(TelegramMessagePhoto.class);


	@Override
	public Media getObject() {
//		return new Media(Media.MediaType.PATH, "/media/olbaid/Volume/94517.jpg", null,  "caption");
		//Photo Id from Telegram
		return new Media(Media.MediaType.ID, null, "AgACAgQAAxkDAAIBJWcVMhnwninrxiKtePVSbt3UbUC_AAK7wjEbkFGoUGJkVYSa6r-dAQADAgADdwADNgQ", "caption");
	}
}
