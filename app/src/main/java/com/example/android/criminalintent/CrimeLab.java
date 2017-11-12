package com.example.android.criminalintent;

import android.content.Context;

/**
 * Created by Sukora Stas on 12.11.2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private CrimeLab(Context context) {

    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
}
