package com.example.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Sukora Stas on 12.11.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
