package com.olbaid.telegram;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TelegramOperationInput
 * Author: Olbaid
 */
@ApplicationScoped
public class TelegramOperationInput extends TelegramOperation{

    private static final Logger LOG = LoggerFactory.getLogger(TelegramOperationInput.class);

    @Inject
    private TelegramClient telegramClient;


    public void getUpdates() {
        Response response = telegramClient.getBaseTarget().path("getUpdates")
                .queryParam("offset", -1)
                .request()
                .get();

        handleResponse(response, "Get updates failed!");
    }
}