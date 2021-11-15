package com.devyat.miwok.models;

public class Word {
    private final String defaultTrans;
    private final String miwokTrans;
    private int imageId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public  Word(String defaultTrans, String miwokTrans, int imageId){
        this.defaultTrans = defaultTrans;
        this.miwokTrans = miwokTrans;
        this.imageId = imageId;
    }

    public  Word(String defaultTrans, String miwokTrans){
        this.defaultTrans = defaultTrans;
        this.miwokTrans = miwokTrans;
    }

    public String getDefaultTranslation() {
        return this.defaultTrans;
    }

    public String getMiwokTranslation() {
        return this.miwokTrans;
    }

    public int getImageId(){
        return  this.imageId;
    };

    public boolean hasImage(){
        return  imageId != NO_IMAGE;
    }
}
