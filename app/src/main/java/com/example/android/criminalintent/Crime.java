package com.example.android.criminalintent;

import java.util.UUID;



public class Crime {

    private UUID mid;
    private String mTitle;

    public Crime() {
        mid = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getMid() {
        return mid;
    }
}
