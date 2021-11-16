package com.devyat.miwok.helpers;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class AudioPlayer {
    private MediaPlayer mMusicPlayer;

    public void prepareAsset(Context context, int resource) {
        mMusicPlayer = MediaPlayer.create(context, resource);
        mMusicPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                //release();
            }
        });
    }

    public void release() {
        if (mMusicPlayer != null) {
            Log.v("AudioPlayer", "Releasing audio player");
            mMusicPlayer.release();
            mMusicPlayer = null;
        }
    }

    public void pause(){
        mMusicPlayer.pause();
    }

    public void stop(){
        mMusicPlayer.stop();
        release();
    }

    public void play(){
        mMusicPlayer.start();
    }
}
