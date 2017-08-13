package com.example.naveed.practiceapp.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveed on 13/08/2017.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter{

    private List<Fragment> mflist = new ArrayList<>();
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {

        return mflist.get(position);
    }
    @Override
    public int getCount() {
        return  mflist.size();
    }
    public void addToList(Fragment fragment)
    {
        mflist.add(fragment);
    }

}
