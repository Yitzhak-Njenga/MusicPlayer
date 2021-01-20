
package com.moringaschool.musicplayer.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist_ implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tracklist")
    @Expose
    private String tracklist;
    @SerializedName("type")
    @Expose
    private String type;
    private final static long serialVersionUID = -3721343512677387184L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist_() {
    }

    /**
     * 
     * @param tracklist
     * @param name
     * @param id
     * @param type
     */
    public Artist_(Integer id, String name, String tracklist, String type) {
        super();
        this.id = id;
        this.name = name;
        this.tracklist = tracklist;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
