package com.devyat.miwok.helpers;

import android.media.MediaPlayer;
import java.io.File;

public class AudioPlayer {
    public void play(String path, String fileName){
        //set up MediaPlayer
        MediaPlayer mp = new MediaPlayer();

        try {
            mp.setDataSource(path + File.separator + fileName);
            mp.prepare();
            mp.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
