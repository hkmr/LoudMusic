package com.example.android.loudmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class SongPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_player);

        String[] songData = getIntent().getStringArrayExtra("songData");
        int songImageId = getIntent().getIntExtra("songImage",R.drawable.sanju);

        TextView songName = (TextView) findViewById(R.id.song_name);
        songName.setText(songData[0]);
//
        TextView singerName = (TextView) findViewById(R.id.singer_name);
        singerName.setText(songData[2]);

        ImageView albumThumbImage = (ImageView) findViewById(R.id.album_image_thumb);
        albumThumbImage.setImageResource(songImageId);
//
        ImageView albumLargeImage = (ImageView) findViewById(R.id.album_image_large);
        albumLargeImage.setImageResource(songImageId);

    }
}
