package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatAdministratorRights {

    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    @JsonProperty("can_manage_chat")
    private Boolean canManageChat;

    @JsonProperty("can_delete_messages")
    private Boolean canDeleteMessages;

    @JsonProperty("can_manage_video_chats")
    private Boolean canManageVideoChats;

    @JsonProperty("can_restrict_members")
    private Boolean canRestrictMembers;

    @JsonProperty("can_promote_members")
    private Boolean canPromoteMembers;

    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;

    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;

    @JsonProperty("can_post_stories")
    private Boolean canPostStories;

    @JsonProperty("can_edit_stories")
    private Boolean canEditStories;

    @JsonProperty("can_delete_stories")
    private Boolean canDeleteStories;

    @JsonProperty("can_post_messages")
    private Boolean canPostMessages;

    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages;

    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;

    @JsonProperty("can_manage_topics")
    private Boolean canManageTopics;

    // Getters and setters

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Boolean getCanManageChat() {
        return canManageChat;
    }

    public void setCanManageChat(Boolean canManageChat) {
        this.canManageChat = canManageChat;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public void setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
    }

    public Boolean getCanManageVideoChats() {
        return canManageVideoChats;
    }

    public void setCanManageVideoChats(Boolean canManageVideoChats) {
        this.canManageVideoChats = canManageVideoChats;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public void setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public void setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    public Boolean getCanPostStories() {
        return canPostStories;
    }

    public void setCanPostStories(Boolean canPostStories) {
        this.canPostStories = canPostStories;
    }

    public Boolean getCanEditStories() {
        return canEditStories;
    }

    public void setCanEditStories(Boolean canEditStories) {
        this.canEditStories = canEditStories;
    }

    public Boolean getCanDeleteStories() {
        return canDeleteStories;
    }

    public void setCanDeleteStories(Boolean canDeleteStories) {
        this.canDeleteStories = canDeleteStories;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public void setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public void setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public void setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
    }
}