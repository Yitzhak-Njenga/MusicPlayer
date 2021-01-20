
package com.moringaschool.musicplayer.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Genres implements Serializable
{

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private final static long serialVersionUID = 3696025809616953956L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Genres() {
    }

    /**
     * 
     * @param data
     */
    public Genres(List<Datum> data) {
        super();
        this.data = data;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
