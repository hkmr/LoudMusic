package com.example.android.loudmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecentSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_songs);

        ArrayList<Song> recentSongs = new ArrayList<>();
        recentSongs.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));

        final SongAdapter recentSongsAdapter = new SongAdapter(this,recentSongs);

        ListView listView = (ListView) findViewById(R.id.recent_played_songs_list);
        listView.setAdapter(recentSongsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Song currentSong = recentSongsAdapter.getItem(position);

                String[] songData = {
                        currentSong.getSongName(),
                        currentSong.getAlbumName(),
                        currentSong.getSingerName(),
                };

                int songImageId = currentSong.getSongImage();

                Intent player = new Intent(RecentSongsActivity.this,SongPlayerActivity.class).putExtra("songData",songData);
                player.putExtra("songImage",songImageId);
                startActivity(player);
            }
        });
    }
}
