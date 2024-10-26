package com.olbaid.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Animation {
    @JsonProperty("mime_type")
    private String mimeType;
    private Integer duration;
    private Integer width;
    private Integer height;
    private Thumbnail thumbnail;
    private Thumbnail thumb;
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("file_unique_id")
    private String fileUniqueId;
    @JsonProperty("file_size")
    private Integer fileSize;
    @JsonProperty("file_name")
    private String fileName;

    // Getters and setters
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Thumbnail getThumb() {
        return thumb;
    }

    public void setThumb(Thumbnail thumb) {
        this.thumb = thumb;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}