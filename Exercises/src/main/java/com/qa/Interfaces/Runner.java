package com.qa.Interfaces;

public class Runner {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone();
        CDplayer cDplayer = new CDplayer();

        smartPhone.showLocation();
        smartPhone.giveDirections();

        cDplayer.playMusic();
        cDplayer.pauseMusic();
    }
}
