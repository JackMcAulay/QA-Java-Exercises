package com.qa.Interfaces;

public class CDplayer implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Music Starts playing from CD Player");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music Pauses");
    }
}
