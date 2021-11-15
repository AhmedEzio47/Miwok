package com.devyat.miwok.helpers;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {
    public static void playAsset(Context context, int resource) {
        try {
            MediaPlayer mp = MediaPlayer.create(context, resource);
            mp.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
