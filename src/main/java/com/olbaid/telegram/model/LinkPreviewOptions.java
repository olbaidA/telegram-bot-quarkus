package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinkPreviewOptions {
    @JsonProperty("url")
    private String url;

    // Getters and setters

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}