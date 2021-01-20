
package com.moringaschool.musicplayer.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_ implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("readable")
    @Expose
    private Boolean readable;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_short")
    @Expose
    private String titleShort;
    @SerializedName("title_version")
    @Expose
    private String titleVersion;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("explicit_lyrics")
    @Expose
    private Boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    @Expose
    private Integer explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    @Expose
    private Integer explicitContentCover;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("md5_image")
    @Expose
    private String md5Image;
    @SerializedName("artist")
    @Expose
    private Artist_ artist;
    @SerializedName("type")
    @Expose
    private String type;
    private final static long serialVersionUID = 8750965950933792570L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum_() {
    }

    /**
     * 
     * @param readable
     * @param preview
     * @param artist
     * @param explicitContentLyrics
     * @param link
     * @param md5Image
     * @param title
     * @param type
     * @param duration
     * @param titleVersion
     * @param rank
     * @param titleShort
     * @param explicitLyrics
     * @param id
     * @param explicitContentCover
     */
    public Datum_(Integer id, Boolean readable, String title, String titleShort, String titleVersion, String link, Integer duration, Integer rank, Boolean explicitLyrics, Integer explicitContentLyrics, Integer explicitContentCover, String preview, String md5Image, Artist_ artist, String type) {
        super();
        this.id = id;
        this.readable = readable;
        this.title = title;
        this.titleShort = titleShort;
        this.titleVersion = titleVersion;
        this.link = link;
        this.duration = duration;
        this.rank = rank;
        this.explicitLyrics = explicitLyrics;
        this.explicitContentLyrics = explicitContentLyrics;
        this.explicitContentCover = explicitContentCover;
        this.preview = preview;
        this.md5Image = md5Image;
        this.artist = artist;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleShort() {
        return titleShort;
    }

    public void setTitleShort(String titleShort) {
        this.titleShort = titleShort;
    }

    public String getTitleVersion() {
        return titleVersion;
    }

    public void setTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getExplicitLyrics() {
        return explicitLyrics;
    }

    public void setExplicitLyrics(Boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public Integer getExplicitContentLyrics() {
        return explicitContentLyrics;
    }

    public void setExplicitContentLyrics(Integer explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public Integer getExplicitContentCover() {
        return explicitContentCover;
    }

    public void setExplicitContentCover(Integer explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getMd5Image() {
        return md5Image;
    }

    public void setMd5Image(String md5Image) {
        this.md5Image = md5Image;
    }

    public Artist_ getArtist() {
        return artist;
    }

    public void setArtist(Artist_ artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
