package com.runequest.navigation;

import com.runequest.fragments.ProfileFragment;

/**
 * Created by meyers on 2015-08-25.
 */
public class ProfileNavItem extends NavItem {

    public ProfileNavItem(String title, String subtitle, int icon) {
        super(title, subtitle, icon);
    }

    @Override
    protected void constructFragment() {
        mFragment = new ProfileFragment();
    }
}
