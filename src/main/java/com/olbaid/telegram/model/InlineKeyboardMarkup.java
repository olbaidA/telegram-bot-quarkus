package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class InlineKeyboardMarkup {
    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    // Default constructor
    public InlineKeyboardMarkup() {
    }

    // Parameterized constructor
    public InlineKeyboardMarkup(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }
}