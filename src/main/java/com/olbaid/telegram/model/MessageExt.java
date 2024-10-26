package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageExt {

    @JsonProperty("message_id")
    private Integer messageId;

    @JsonProperty("from")
    private User from;

    @JsonProperty("chat")
    private Chat chat;

    @JsonProperty("date")
    private Integer date;

    @JsonProperty("text")
    private String text;

    @JsonProperty("entities")
    private MessageEntity[] entities;

    @JsonProperty("photo")
    private PhotoSize[] photo;

    @JsonProperty("animation")
    private Animation animation;

    @JsonProperty("caption")
    private String caption;

    @JsonProperty("document")
    private Document document;

    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    @JsonProperty("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    // Getters and setters

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessageEntity[] getEntities() {
        return entities;
    }

    public void setEntities(MessageEntity[] entities) {
        this.entities = entities;
    }

    public PhotoSize[] getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoSize[] photo) {
        this.photo = photo;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public LinkPreviewOptions getLinkPreviewOptions() {
        return linkPreviewOptions;
    }

    public void setLinkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
        this.linkPreviewOptions = linkPreviewOptions;
    }
}