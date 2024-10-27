package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyboardButton {

    private String text;

    @JsonProperty("request_users")
    private KeyboardButtonRequestUsers requestUsers;

    @JsonProperty("request_chat")
    private KeyboardButtonRequestChat requestChat;

    @JsonProperty("request_contact")
    private Boolean requestContact;

    @JsonProperty("request_location")
    private Boolean requestLocation;

    @JsonProperty("request_poll")
    private KeyboardButtonPollType requestPoll;

    @JsonProperty("web_app")
    private WebAppInfo webApp;

    public KeyboardButton(String text) {
        this.text = text;
    }

    public KeyboardButton(String text, KeyboardButtonRequestUsers requestUsers, KeyboardButtonRequestChat requestChat, Boolean requestContact, Boolean requestLocation, KeyboardButtonPollType requestPoll, WebAppInfo webApp) {
        this.text = text;
        this.requestUsers = requestUsers;
        this.requestChat = requestChat;
        this.requestContact = requestContact;
        this.requestLocation = requestLocation;
        this.requestPoll = requestPoll;
        this.webApp = webApp;
    }

    // Getters and setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public KeyboardButtonRequestUsers getRequestUsers() {
        return requestUsers;
    }

    public void setRequestUsers(KeyboardButtonRequestUsers requestUsers) {
        this.requestUsers = requestUsers;
    }

    public KeyboardButtonRequestChat getRequestChat() {
        return requestChat;
    }

    public void setRequestChat(KeyboardButtonRequestChat requestChat) {
        this.requestChat = requestChat;
    }

    public Boolean getRequestContact() {
        return requestContact;
    }

    public void setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public void setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
    }

    public KeyboardButtonPollType getRequestPoll() {
        return requestPoll;
    }

    public void setRequestPoll(KeyboardButtonPollType requestPoll) {
        this.requestPoll = requestPoll;
    }

    public WebAppInfo getWebApp() {
        return webApp;
    }

    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }
}