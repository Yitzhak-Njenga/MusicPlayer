package com.moringaschool.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moringaschool.musicplayer.adapter.AlbumsAdapter;

import com.moringaschool.musicplayer.models.Item;

import com.moringaschool.musicplayer.models.Snippet;
import com.moringaschool.musicplayer.models.YoutubeSongs;
import com.moringaschool.musicplayer.services.MusicClient;
import com.moringaschool.musicplayer.services.MusicApi;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AlbumLibrary extends AppCompatActivity {

    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.albumRecycle) RecyclerView mAlbumRecyclerView;
    @BindView(R.id.errorText) TextView mErrorText;

    private AlbumsAdapter mAlbumsAdapter;
    private List<Item> artists;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);
        ButterKnife.bind(this);


        MusicApi client = MusicClient.getClient().create(MusicApi.class);
        Call<YoutubeSongs> call = client.getItem("snippet","video","music",Constants.YOUTUBE_Api);

        call.enqueue(new Callback<YoutubeSongs>() {
            @Override
            public void onResponse(Call<YoutubeSongs> call, Response<YoutubeSongs> response) {
                hideProgressBar();
                if (response.isSuccessful()){
                    artists = response.body().getItems();
                    mAlbumsAdapter = new AlbumsAdapter(AlbumLibrary.this,artists);
                    mAlbumRecyclerView.setAdapter(mAlbumsAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AlbumLibrary.this);
                    mAlbumRecyclerView.setLayoutManager(layoutManager);
                    mAlbumRecyclerView.setHasFixedSize(true);



                    showArtists();

                }
            }

            @Override
            public void onFailure(Call<YoutubeSongs> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();

            }
        });
    }

    public void showFailureMessage(){
        mErrorText.setText("Check your Internet Connection");
        mErrorText.setText(View.VISIBLE);
    }

    public void hideProgressBar(){
        mProgressBar.setVisibility(View.GONE);

    }
    public  void  showArtists(){
        mAlbumRecyclerView.setVisibility(View.VISIBLE);
    }
}