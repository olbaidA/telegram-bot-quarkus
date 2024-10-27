package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyboardButtonRequestChat {

    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("chat_is_channel")
    private Boolean chatIsChannel;

    @JsonProperty("chat_is_forum")
    private Boolean chatIsForum;

    @JsonProperty("chat_has_username")
    private Boolean chatHasUsername;

    @JsonProperty("chat_is_created")
    private Boolean chatIsCreated;

    @JsonProperty("user_administrator_rights")
    private ChatAdministratorRights userAdministratorRights;

    @JsonProperty("bot_administrator_rights")
    private ChatAdministratorRights botAdministratorRights;

    @JsonProperty("bot_is_member")
    private Boolean botIsMember;

    @JsonProperty("request_title")
    private Boolean requestTitle;

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

    public Boolean getChatIsChannel() {
        return chatIsChannel;
    }

    public void setChatIsChannel(Boolean chatIsChannel) {
        this.chatIsChannel = chatIsChannel;
    }

    public Boolean getChatIsForum() {
        return chatIsForum;
    }

    public void setChatIsForum(Boolean chatIsForum) {
        this.chatIsForum = chatIsForum;
    }

    public Boolean getChatHasUsername() {
        return chatHasUsername;
    }

    public void setChatHasUsername(Boolean chatHasUsername) {
        this.chatHasUsername = chatHasUsername;
    }

    public Boolean getChatIsCreated() {
        return chatIsCreated;
    }

    public void setChatIsCreated(Boolean chatIsCreated) {
        this.chatIsCreated = chatIsCreated;
    }

    public ChatAdministratorRights getUserAdministratorRights() {
        return userAdministratorRights;
    }

    public void setUserAdministratorRights(ChatAdministratorRights userAdministratorRights) {
        this.userAdministratorRights = userAdministratorRights;
    }

    public ChatAdministratorRights getBotAdministratorRights() {
        return botAdministratorRights;
    }

    public void setBotAdministratorRights(ChatAdministratorRights botAdministratorRights) {
        this.botAdministratorRights = botAdministratorRights;
    }

    public Boolean getBotIsMember() {
        return botIsMember;
    }

    public void setBotIsMember(Boolean botIsMember) {
        this.botIsMember = botIsMember;
    }

    public Boolean getRequestTitle() {
        return requestTitle;
    }

    public void setRequestTitle(Boolean requestTitle) {
        this.requestTitle = requestTitle;
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