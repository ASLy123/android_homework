package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShetuanActivity extends AppCompatActivity {
    private int[] imgs = {R.drawable.yumaoqiu, R.drawable.lanqiuc,
            R.drawable.shufashe, R.drawable.duzhexiehui,
            R.drawable.xinwenshe, R.drawable.wudaosheh,
            R.drawable.dianjinshe, R.drawable.huabanshe,
            R.drawable.lunhuashe, R.drawable.jishuanjishe,
            R.drawable.xueshenghui, R.drawable.zhiyuanzhexiehui,
            R.drawable.zuqiu,};
    private String[] names = {"羽毛球社", "篮球社", "书法社", "读者协会",
            "新闻社", "舞蹈社", "电竞社", "滑板社","轮滑社","计算机协会","学生会","志愿者协会","足球社"};
    private int[] descs = {R.string.ymq,R.string.lqs,R.string.sfs,R.string.dzxh,R.string.xws,R.string.wds,
                            R.string.djs,R.string.hbs,R.string.lhs,R.string.jsjxh,R.string.xsh,R.string.zyzxh,R.string.zqs};




    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < imgs.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("img", imgs[i]);
            map.put("name", names[i]);
            map.put("desc", descs[i]);
            list.add(map);
        }
        return list;

    }

    private List<Map<String, Object>> findNameData(String s) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (Map<String, Object> map : getData()) {
            if (map.get("name").toString().indexOf(s) >= 0) {
                list.add(map);
            }
        }
        return list;
    }

    private ListView list_test;




        @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shetuan);
            list_test = findViewById(R.id.list_test);

            TestAdapter testAdapter = new TestAdapter(this, getData());
            list_test.setAdapter(testAdapter);
            list_test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(ShetuanActivity.this,ShetuanJieshaoActivity.class);
                    Bundle bundle=new Bundle();
                    bundle.putSerializable("shetuanjieshao",(Serializable)getData().get(position));
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            });







        }
}