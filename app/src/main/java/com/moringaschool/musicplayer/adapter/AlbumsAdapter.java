package com.moringaschool.musicplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.musicplayer.R;
import com.moringaschool.musicplayer.models.Artist;
import com.moringaschool.musicplayer.models.Datum;
import com.moringaschool.musicplayer.models.Datum_;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.AlbumsViewHolder>{
    private Context mcontext;
    private List<Artist> mArtists;

    public AlbumsAdapter(Context context,List<Artist> artists){
        mcontext = context;
        mArtists = artists;

    }

    public  class AlbumsViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.titleTextView) TextView mTittleTextView;
        @BindView(R.id.artistNameView) TextView mArtistName;
        @BindView(R.id.alumLink) TextView mAlbumLink;

        private Context mContext;

        public AlbumsViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

        public  void bindAlbums(Artist artist){
            mArtistName.setText(artist.getName());
           mTittleTextView.setText(artist.getId());
           mAlbumLink.setText(artist.getTracklist());

        }

    }
    @Override
    public  int getItemCount(){
        return mArtists.size();

    }

    @Override
    public AlbumsAdapter.AlbumsViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_raw,parent,false);
            AlbumsViewHolder viewHolder = new AlbumsViewHolder(view);

            return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumsAdapter.AlbumsViewHolder holder, int position){
        holder.bindAlbums(mArtists.get(position));


    }


}
