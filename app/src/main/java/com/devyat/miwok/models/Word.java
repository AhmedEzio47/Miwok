package com.devyat.miwok.models;

public class Word {
    private final String defaultTrans;
    private final String miwokTrans;
    private final  int audioId;
    private static final int NO_IMAGE = -1;
    private int imageId = NO_IMAGE;


    public Word(String defaultTrans, String miwokTrans, int imageId, int audioId) {
        this.defaultTrans = defaultTrans;
        this.miwokTrans = miwokTrans;
        this.imageId = imageId;
        this.audioId = audioId;
    }

    public Word(String defaultTrans, String miwokTrans, int audioId) {
        this.defaultTrans = defaultTrans;
        this.miwokTrans = miwokTrans;
        this.audioId = audioId;
    }

    public String getDefaultTranslation() {
        return this.defaultTrans;
    }

    public String getMiwokTranslation() {
        return this.miwokTrans;
    }

    public int getImageId() {
        return this.imageId;
    }

    public int getAudioId() {
        return this.audioId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }
}
