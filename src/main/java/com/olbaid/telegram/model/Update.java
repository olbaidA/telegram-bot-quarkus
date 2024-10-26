package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Update {
    @JsonProperty("update_id")
    private Long updateId;

    @JsonProperty("message")
    private MessageExt message;

    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery;

    // Getters and setters

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public MessageExt getMessage() {
        return message;
    }

    public void setMessage(MessageExt message) {
        this.message = message;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }
}