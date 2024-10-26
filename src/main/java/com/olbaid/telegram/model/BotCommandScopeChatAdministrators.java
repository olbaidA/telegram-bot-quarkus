package com.olbaid.telegram.model;

public class BotCommandScopeChatAdministrators extends BotCommandScope {
    private String chatId;

    public BotCommandScopeChatAdministrators(String chatId) {
        super("chat_administrators");
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
}
