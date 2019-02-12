package com.example.newroomapp;

import android.support.annotation.NonNull;

public class Word {

    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    public String getWord(){
        return mWord;
    }
}
