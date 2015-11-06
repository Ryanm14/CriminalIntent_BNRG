package me.ryanmiles.criminalintent.activities;

import android.support.v4.app.Fragment;

import me.ryanmiles.criminalintent.fragments.CrimeListFragment;

/**
 * Created by Ryan on 11/1/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
