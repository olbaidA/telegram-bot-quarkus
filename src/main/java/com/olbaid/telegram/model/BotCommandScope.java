package com.olbaid.telegram.model;

public abstract class BotCommandScope {
    private String type;

    public BotCommandScope(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
