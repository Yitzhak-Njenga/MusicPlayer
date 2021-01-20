
package com.moringaschool.musicplayer.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tracks implements Serializable
{

    @SerializedName("data")
    @Expose
    private List<Datum_> data = null;
    private final static long serialVersionUID = -4608945394085769622L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tracks() {
    }

    /**
     * 
     * @param data
     */
    public Tracks(List<Datum_> data) {
        super();
        this.data = data;
    }

    public List<Datum_> getData() {
        return data;
    }

    public void setData(List<Datum_> data) {
        this.data = data;
    }

}
