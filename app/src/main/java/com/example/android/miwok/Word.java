package com.example.android.miwok;

/*  Represent a vocabulary word that the user wants to learn
 *  Class created for group a pair of words to use in the arrays of objects.
 * */
public class Word {

    private String mDefaultTranslation;

    private String mMiworkTranslation;

    //Default contructor
    public Word(String mDefaultTranslation, String mMiworkTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }
}
