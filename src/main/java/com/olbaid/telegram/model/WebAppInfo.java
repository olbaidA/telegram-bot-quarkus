package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebAppInfo {

    private String url;

    public WebAppInfo(String url) {
        this.url = url;
    }

    // Getter and setter

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}