package com.example.android.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;


public class Crime {

    private UUID mid;
    private String mTitle;
    private Date mDate;
    private String mDateFormat;
    private boolean mSolved;

    public Crime() {
        mid = UUID.randomUUID();

        mDate = new Date();
//        mDateFormat = DateFormat.getDateInstance().format(mDate);

//        mDateFormat = DateFormat.getDateInstance(DateFormat.FULL,  Locale.ENGLISH).format(mDate);
        mDateFormat = new SimpleDateFormat("EEEE, MMM d, yyyy", Locale.ENGLISH).format(mDate);

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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getDateFormat() {
        return mDateFormat;
    }

    public void setDateFormat(String dateFormat) {
        mDateFormat = dateFormat;
    }
}
