package com.ismailhakkiaydin.fragmentpageradapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class CustomAdapter extends FragmentStatePagerAdapter {

    private final int ITEMS= 6;

    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
            case 5:
                return new FragmentSix();

            default: return new FragmentOne();


        }
    }

    @Override
    public int getCount() {
        return ITEMS;
    }
}