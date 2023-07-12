package com.example.hjschoolhelper_200301851;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;
import java.util.Map;

public class YxTabPagerAdapter extends FragmentPagerAdapter {
    List<Map<String,Object>> list;
    public YxTabPagerAdapter(@NonNull FragmentManager fm, List<Map<String,Object>>l) {
        super(fm);
        list=l;
    }

    public YxTabPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return (Fragment) list.get(position).get("frag");
    }

    @Override
    public int getCount() {
        return list.size();
    }
    //获取tab


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return (CharSequence) list.get(position).get("tab");
    }
}
