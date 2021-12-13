package com.qa.Interfaces;

public class SmartPhone implements GPS, MusicPlayer{

    @Override
    public void showLocation() {
        System.out.println("Shows current Location");
    }

    @Override
    public void giveDirections() {
        System.out.println("Gives Directions");
    }

    @Override
    public void playMusic() {
        System.out.println("Music Starts playing from Phone");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music Pauses");
    }
}
