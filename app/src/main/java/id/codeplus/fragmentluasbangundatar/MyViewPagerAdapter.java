package id.codeplus.fragmentluasbangundatar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by mudaf on 27/09/2017.
 */

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragmentArrayList;
    ArrayList<String> titlesArrayList;

    public MyViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragmentArrayList, ArrayList<String> titlesArrayList) {
        super(fm);
        this.fragmentArrayList = fragmentArrayList;
        this.titlesArrayList = titlesArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titlesArrayList.get(position);
    }
}
