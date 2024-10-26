package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineKeyboardButton {
    private String text;

    @JsonProperty("callback_data")
    private String callbackData;

    // Default constructor
    public InlineKeyboardButton() {
    }

    // Parameterized constructor
    public InlineKeyboardButton(String text, String callbackData) {
        this.text = text;
        this.callbackData = callbackData;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }
}