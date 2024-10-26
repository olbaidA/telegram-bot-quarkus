package com.olbaid.telegram.getter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olbaid.telegram.getter.model.Media;
import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@LookupIfProperty(name = "telegram.message.impl", stringValue = "randomYesNo")
@ApplicationScoped
public class TelegramMessageRandomYesNo implements TelegramMessageGetter {

	private static final Logger LOG = LoggerFactory.getLogger(TelegramMessageRandomYesNo.class);


	@Override
	public Media getObject() {
//		return new Photo(Photo.PhotoType.ID, null, "AgACAgQAAxkDAAIBJWcVMhnwninrxiKtePVSbt3UbUC_AAK7wjEbkFGoUGJkVYSa6r-dAQADAgADdwADNgQ", "caption");

		//https://yesno.wtf/api
		Client client = ClientBuilder.newClient();
		String result = client.target("https://yesno.wtf/api")
				.request()
				.get(String.class);

		String photoUrl;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(result);
			photoUrl = jsonNode.get("image").asText();
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}

        return new Media(Media.MediaType.ID, null, photoUrl, "");
	}
}
