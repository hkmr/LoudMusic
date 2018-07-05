package com.example.android.loudmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_songs);

        ArrayList<Song> englishSongs = new ArrayList<>();

        englishSongs.add(new Song("Cheap Thrills","Sia","Cheap Thrills",R.drawable.cheap_thrills));
        englishSongs.add(new Song("Attention","Charlie Puth","Attention",R.drawable.attention));
        englishSongs.add(new Song("Let Me Love You","Dj Snake, Justin Bieber","Encore",R.drawable.let_me_love_you));
        englishSongs.add(new Song("Rockabye","Clean Bandit, Sean Paul, Anne Marie","Rockabye",R.drawable.rockabye));
        englishSongs.add(new Song("This Is What You Came For","Calvin Harris, Rihanna","This is What You Came For",R.drawable.this_is_what_you_came_for));

        final SongAdapter englisSongsAdapter = new SongAdapter(this,englishSongs);

        ListView listView = (ListView)findViewById(R.id.english_songs_list);
        listView.setAdapter(englisSongsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Song currentSong = englisSongsAdapter.getItem(position);
//                creating String array of song data {song name , album name, singer name}
                String[] songData = {
                        currentSong.getSongName(),
                        currentSong.getAlbumName(),
                        currentSong.getSingerName(),
                };

//                integer variable containing album image id
                int songImageId = currentSong.getSongImage();

                Intent player = new Intent(EnglishSongsActivity.this,SongPlayerActivity.class);
//                passing data to the player intent
                player.putExtra("songData",songData);
                player.putExtra("songImage",songImageId);
                startActivity(player);
            }
        });
    }
}
