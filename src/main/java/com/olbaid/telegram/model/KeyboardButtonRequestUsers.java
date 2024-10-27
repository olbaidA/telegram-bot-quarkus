package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyboardButtonRequestUsers {

    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("user_is_bot")
    private Boolean userIsBot;

    @JsonProperty("user_is_premium")
    private Boolean userIsPremium;

    @JsonProperty("max_quantity")
    private Integer maxQuantity;

    @JsonProperty("request_name")
    private Boolean requestName;

    @JsonProperty("request_username")
    private Boolean requestUsername;

    @JsonProperty("request_photo")
    private Boolean requestPhoto;

    // Getters and setters

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Boolean getUserIsBot() {
        return userIsBot;
    }

    public void setUserIsBot(Boolean userIsBot) {
        this.userIsBot = userIsBot;
    }

    public Boolean getUserIsPremium() {
        return userIsPremium;
    }

    public void setUserIsPremium(Boolean userIsPremium) {
        this.userIsPremium = userIsPremium;
    }

    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public Boolean getRequestName() {
        return requestName;
    }

    public void setRequestName(Boolean requestName) {
        this.requestName = requestName;
    }

    public Boolean getRequestUsername() {
        return requestUsername;
    }

    public void setRequestUsername(Boolean requestUsername) {
        this.requestUsername = requestUsername;
    }

    public Boolean getRequestPhoto() {
        return requestPhoto;
    }

    public void setRequestPhoto(Boolean requestPhoto) {
        this.requestPhoto = requestPhoto;
    }
}