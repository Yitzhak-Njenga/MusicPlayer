package com.moringaschool.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MusicActivty extends AppCompatActivity {
    @BindView(R.id.musicClip) ImageView MusicLibrary;
    @BindView(R.id.subClip) ImageView Subscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_activty);
    }
}