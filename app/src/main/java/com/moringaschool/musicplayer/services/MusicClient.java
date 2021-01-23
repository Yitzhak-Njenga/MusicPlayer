package com.moringaschool.musicplayer.services;

import com.moringaschool.musicplayer.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MusicClient {

    private static Retrofit retrofit = null;
    private static final String BASE_URL = Constants.YOUTUBE_API_BASE_URL;


    public static Retrofit getClient(){
        if (retrofit== null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

}
