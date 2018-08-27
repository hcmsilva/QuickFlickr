package com.demos.henrique.quickflickr.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlickrFeed {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("generator")
    @Expose
    private String generator;
    @SerializedName("items")
    @Expose
    private List<FlickrPhoto> items = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public FlickrFeed() {
    }

    /**
     *
     * @param title
     * @param items
     * @param description
     * @param link
     * @param generator
     * @param modified
     */
    public FlickrFeed(String title, String link, String description, String modified, String generator, List<FlickrPhoto> items) {
        super();
        this.title = title;
        this.link = link;
        this.description = description;
        this.modified = modified;
        this.generator = generator;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public List<FlickrPhoto> getFlickrPhotos() {
        return items;
    }

    public void setFlickrPhotos(List<FlickrPhoto> items) {
        this.items = items;
    }

}