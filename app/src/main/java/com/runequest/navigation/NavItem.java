package com.runequest.navigation;

import android.support.v4.app.Fragment;

import com.runequest.fragments.DummyFragment;

/**
 * Created by meyers on 2015-08-25.
 */
public class NavItem {

    public String mTitle;
    public String mSubtitle;
    public int mIcon;
    protected Fragment mFragment;

    public NavItem(String title, String subtitle, int icon) {
        mTitle = title;
        mSubtitle = subtitle;
        mIcon = icon;
    }

    public Fragment getFragment() {
        if (mFragment == null)
        {
            constructFragment();
        }
        return mFragment;
    }

    protected void constructFragment() {
        mFragment = new DummyFragment();
    }
}
