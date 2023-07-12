package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HanghaiActivity extends AppCompatActivity {
    private HahaiJieshaoFragment hahaiJieshaoFragment;
    private HahaiZuanyeFragment hahaiZuanyeFragment;
    private HahaiShiziFragment hahaiShiziFragment;
    private TabLayout tab_test;
    private ViewPager pager_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanghai);
        tab_test = findViewById(R.id.tab_test);
        pager_test = findViewById(R.id.pager_test);

        String[] tabtitles = {"学院介绍", "专业介绍", "师资介绍"};
        List<Map<String, Object>> list = new ArrayList<>();
        Fragment[] fragments4 = {new HahaiJieshaoFragment(), new HahaiZuanyeFragment(), new HahaiShiziFragment()};
        for (int i = 0; i < tabtitles.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("tab", tabtitles[i]);
            map.put("frag", fragments4[i]);
            list.add(map);
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //配置数据适配器
        YxTabPagerAdapter yxtabPagerAdapter = new YxTabPagerAdapter(fm, list);
        //关联TabLayout和ViewPager
        tab_test.setupWithViewPager(pager_test);

        //显示
        pager_test.setAdapter(yxtabPagerAdapter);
    }
}