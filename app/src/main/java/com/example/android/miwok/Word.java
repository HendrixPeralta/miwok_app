package com.example.android.miwok;

/**
 * Created by hdx on 21/02/18.
 */

public class Word {

    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String englishTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
    }

    public Word(String englishTranslation, String miwokTranslation, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceID = imageResourceID;
    }


    public String getMiwokWord(){
        return mMiwokTranslation;
    }

    public String getEnglishWord(){
        return mEnglishTranslation;
    }

    public int getIdImage(){
        return mImageResourceID;
    }

    public boolean hasImage() {return mImageResourceID != NO_IMAGE_PROVIDED;}


}
