package com.olbaid.telegram;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Singleton;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TelegramClient
 * Author: Olbaid
 */
@Singleton
public class TelegramClient {

    private static final Logger LOG = LoggerFactory.getLogger(TelegramClient.class);

    @ConfigProperty(name = "telegram.token")
    private String token;

    private Client client;
    private WebTarget baseTarget;

    @PostConstruct
    void initClient() {
        client = ClientBuilder.newClient();
        baseTarget = client.target("https://api.telegram.org/bot{token}").resolveTemplate("token", this.token);
    }

    @PreDestroy
    public void closeClient() {
        client.close();
    }

    public WebTarget getBaseTarget() {
        return baseTarget;
    }
}