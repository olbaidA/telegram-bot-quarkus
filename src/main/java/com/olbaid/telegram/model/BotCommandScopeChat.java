package com.olbaid.telegram.model;

public class BotCommandScopeChat extends BotCommandScope {
    private String chatId;

    public BotCommandScopeChat(String chatId) {
        super("chat");
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
}
