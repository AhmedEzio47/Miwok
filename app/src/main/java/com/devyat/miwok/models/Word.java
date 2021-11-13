package com.devyat.miwok.models;

public class Word {
    private String defaultTrans;
    private String miwokTrans;

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
}
