package com.example.ahmedelbasha.miwok;
/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    /** Default translation for the word */
    private String mMiwokTranslation;
    /** Default translation for the word */
    private String mDefaultTranslation;

    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
