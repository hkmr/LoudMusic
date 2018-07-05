package com.example.android.loudmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_songs);

        ArrayList<Song> hindiSongsList = new ArrayList<>();

        hindiSongsList.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));
        hindiSongsList.add(new Song("Safar","Bhuvan Bam","Safar",R.drawable.safar));
        hindiSongsList.add(new Song("Tareefan","Badshah","Veere Di Wedding",R.drawable.veere_di_wedding));
        hindiSongsList.add(new Song("Ae Watan (Male)","Arijit Singh","Raazi",R.drawable.raazi));
        hindiSongsList.add(new Song("Sapna","Arijit Singh","Parmanu",R.drawable.parmanu));
        hindiSongsList.add(new Song("Kar Har Maidan Fateh","Sukhwinder Singh","Sanju",R.drawable.sanju));
        hindiSongsList.add(new Song("Safar","Bhuvan Bam","Safar",R.drawable.safar));

        final SongAdapter hindiSongsListAdapter = new SongAdapter(this,hindiSongsList);

        ListView listView = (ListView)findViewById(R.id.hindi_songs_list);
        listView.setAdapter(hindiSongsListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Song currentSong = hindiSongsListAdapter.getItem(position);

                String[] songData = {
                        currentSong.getSongName(),
                        currentSong.getAlbumName(),
                        currentSong.getSingerName(),
                };

                int songImageId = currentSong.getSongImage();

                Intent player = new Intent(HindiSongsActivity.this,SongPlayerActivity.class);
                player.putExtra("songData",songData);
                player.putExtra("songImage",songImageId);
                startActivity(player);
            }
        });
    }
}
