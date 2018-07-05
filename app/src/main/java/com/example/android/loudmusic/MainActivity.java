package com.example.android.loudmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView top100Songs = (TextView) findViewById(R.id.top_100_songs);
        top100Songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent top100Intenet = new Intent(MainActivity.this,SongsTop100Activity.class);
                startActivity(top100Intenet);
            }
        });

        TextView recentPlayed = (TextView)findViewById(R.id.recent_played_songs);
        recentPlayed.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent recentPlayedIntent = new Intent(MainActivity.this,RecentSongsActivity.class);
                startActivity(recentPlayedIntent);
            }
        });

        TextView englishSongs = (TextView)findViewById(R.id.english_songs);
        englishSongs.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent englishSongIntent = new Intent(MainActivity.this,EnglishSongsActivity.class);
                startActivity(englishSongIntent);
            }
        });

        TextView hindiSongs = (TextView)findViewById(R.id.hindi_songs);
        hindiSongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent hindiSongsIntent = new Intent(MainActivity.this,HindiSongsActivity.class);
                startActivity(hindiSongsIntent);
            }
        });

    }
}
