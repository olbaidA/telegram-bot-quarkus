package com.olbaid.telegram.getter.model;

public class Media {

    public enum MediaType {
        PATH("PATH"),
        ID("ID");

        MediaType(String type) {
            this.type = type;
        }
        private String type;
        public String getType() {
            return type;
        }
    }

    private String path;
    private String idOrUrl;
    private String caption;
    private final MediaType type;

    public Media(MediaType type, String path, String id, String caption) {
        this.type = type;
        this.path = path;
        this.idOrUrl = id;
        this.caption = caption;
    }

    public String getPath() {
        return path;
    }

    public String getCaption() {
        return caption;
    }

    public String getIdOrUrl() {
        return idOrUrl;
    }

    public MediaType getType() {
        return type;
    }

}
