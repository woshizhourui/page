package com.example.page;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager manager){
        super(manager);

    }
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return  new FirstFragment();
        }else if(position==1){
            return  new SecondFragment();
        }else{
            return new thirdFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "Title"+position;
    }


        @Override
    public int getCount() {
        return 3;
    }
}
