package com.olbaid.telegram.model;

public class BotCommandScopeChatMember extends BotCommandScope {
    private String chatId;
    private Integer userId;

    public BotCommandScopeChatMember(String chatId, Integer userId) {
        super("chat_member");
        this.chatId = chatId;
        this.userId = userId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
