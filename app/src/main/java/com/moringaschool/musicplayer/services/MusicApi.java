package com.moringaschool.musicplayer.services;


import com.moringaschool.musicplayer.models.YoutubeSongs;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusicApi {
    @GET("search")
    Call<YoutubeSongs> getItem(
            @Query("part") String part,
            @Query("type") String type,
            @Query("q") String q,
            @Query("key") String key
    );
}
