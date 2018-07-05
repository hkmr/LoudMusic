package com.example.android.loudmusic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> song_list){
        super(context,0, song_list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_list_item_view,parent,false);
        }

        Song currentSong = getItem(position);

        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentSong.getAlbumName());

        TextView singerName = (TextView) listItemView.findViewById(R.id.singer_name);
        singerName.setText(currentSong.getSingerName());

        ImageView songImage = (ImageView) listItemView.findViewById(R.id.song_image);
        songImage.setImageResource(currentSong.getSongImage());

        return listItemView;

    }
}
