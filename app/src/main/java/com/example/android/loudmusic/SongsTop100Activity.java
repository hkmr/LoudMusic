package com.example.android.loudmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsTop100Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_100_songs);

        ArrayList<Song> song_list = new ArrayList<>();
        song_list.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));
        song_list.add(new Song("Safar","Bhuvan Bam","Safar",R.drawable.safar));
        song_list.add(new Song("Tareefan","Badshah","Veere Di Wedding",R.drawable.veere_di_wedding));
        song_list.add(new Song("Ae Watan (Male)","Arijit Singh","Raazi",R.drawable.raazi));
        song_list.add(new Song("Sapna","Arijit Singh","Parmanu",R.drawable.parmanu));
        song_list.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));
        song_list.add(new Song("Safar","Bhuvan Bam","Safar",R.drawable.safar));
        song_list.add(new Song("Tareefan","Badshah","Veere Di Wedding",R.drawable.veere_di_wedding));
        song_list.add(new Song("Ae Watan (Male)","Arijit Singh","Raazi",R.drawable.raazi));
        song_list.add(new Song("Sapna","Arijit Singh","Parmanu",R.drawable.parmanu));
        song_list.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));
        song_list.add(new Song("Safar","Bhuvan Bam","Safar",R.drawable.safar));
        song_list.add(new Song("Tareefan","Badshah","Veere Di Wedding",R.drawable.veere_di_wedding));
        song_list.add(new Song("Ae Watan (Male)","Arijit Singh","Raazi",R.drawable.raazi));
        song_list.add(new Song("Sapna","Arijit Singh","Parmanu",R.drawable.parmanu));
        song_list.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));
        song_list.add(new Song("Safar","Bhuvan Bam","Safar",R.drawable.safar));
        song_list.add(new Song("Tareefan","Badshah","Veere Di Wedding",R.drawable.veere_di_wedding));
        song_list.add(new Song("Ae Watan (Male)","Arijit Singh","Raazi",R.drawable.raazi));
        song_list.add(new Song("Sapna","Arijit Singh","Parmanu",R.drawable.parmanu));

        ListView listView = (ListView) findViewById(R.id.top_100_songs_list);

        final SongAdapter songAdapter = new SongAdapter(this,song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Song currentSong = songAdapter.getItem(position);

                String[] songData = {
                        currentSong.getSongName(),
                        currentSong.getAlbumName(),
                        currentSong.getSingerName(),
                };

                int songImageId = currentSong.getSongImage();

                Intent player = new Intent(SongsTop100Activity.this,SongPlayerActivity.class);
                player.putExtra("songData",songData);
                player.putExtra("songImage",songImageId);
                startActivity(player);
            }
        });

    }
}
