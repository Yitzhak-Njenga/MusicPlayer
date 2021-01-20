package com.moringaschool.musicplayer.services;

import com.moringaschool.musicplayer.models.Songs;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusicApi {
    @GET("album/302127")
    Call<Songs> getAlbums(
            @Query("apikey") String apikey
    );
}
