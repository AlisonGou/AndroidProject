package com.example.alisongou.crimeIntent;

import android.support.v4.app.Fragment;

/**
 * Created by alisongou on 12/22/18.
 */


public class CrimeListActivity extends SingleFragmentActivity {
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
