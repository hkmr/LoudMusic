package com.example.android.loudmusic;

public class Song {

    private String mSongName;
    private String mSingerName;
    private String mAlbumName;
    private int mSongImage;

    public Song(String songName, String singerName, String albumName, int songImage){
        this.mSongName = songName;
        this.mSingerName = singerName;
        this.mAlbumName = albumName;
        this.mSongImage = songImage;
    }

    public String getSongName(){
        return this.mSongName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getSingerName() {
        return mSingerName;
    }

    public int getSongImage() {
        return mSongImage;
    }
}
