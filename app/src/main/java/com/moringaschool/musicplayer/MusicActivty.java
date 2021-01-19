package com.moringaschool.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicActivty extends AppCompatActivity {
    @BindView(R.id.musicClip) ImageView MusicLibrary;
    @BindView(R.id.subClip) ImageView Subscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_activty);
        ButterKnife.bind(this);

        MusicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MusicActivty.this, AlbumLibrary.class);
                startActivity(intent);
            }
        });

        Subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MusicActivty.this,AlbumLibrary.class);
                startActivity(intent);
            }
        });
    }

}