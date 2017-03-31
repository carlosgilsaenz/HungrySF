package com.example.csaenz.hungrysf;

/**
 * Created by csaenz on 3/29/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        switch (position) {
            case 0:
                return new AmericanFragment();
            case 1:
                return new AsianFragment();
            case 2:
                return new MiddleEasternFragment();
            default:
                return new LatinFragment();
        }
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.american_fragment_title);
            case 1:
                return mContext.getString(R.string.asian_fragment_title);
            case 2:
                return mContext.getString(R.string.middle_eastern_fragment_title);
            case 3:
                return mContext.getString(R.string.latin_fragment_title);
        }
        return null;
    }
}