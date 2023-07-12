package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShetuanJingcaiMainActivity extends AppCompatActivity {

    int[] photoes0={R.drawable.ymq1,R.drawable.ymq2, R.drawable.ymq3,
            R.drawable.ymq4, R.drawable.ymq5,R.drawable.ymq6,};
    int[] photoes1 ={R.drawable.lq1,R.drawable.lq2, R.drawable.lq3,
            R.drawable.lq4,R.drawable.lq5, R.drawable.lq6};
    int[] photoes2={R.drawable.sf1, R.drawable.sf2, R.drawable.sf3,
            R.drawable.sf4,R.drawable.sf5, R.drawable.sf6, };

    int[] photoes3 ={R.drawable.dz1, R.drawable.dz2, R.drawable.dz3,
            R.drawable.dz4, R.drawable.dz5, R.drawable.dz6,
            };
    int[] photoes4={R.drawable.xw1,R.drawable.xw2,
            R.drawable.xw3,R.drawable.xw4,
            R.drawable.xw5,R.drawable.xw6,};

    int[] photoes5={R.drawable.wd1,R.drawable.wd2,
            R.drawable.wd3,R.drawable.wd4,
            R.drawable.wd5,R.drawable.wd6,};

    int[] photoes6={R.drawable.dj1,R.drawable.dj2,
            R.drawable.dj3,R.drawable.dj4,
            R.drawable.dj5,R.drawable.dj6,};

    int[] photoes7={R.drawable.hb1,R.drawable.hb2,
            R.drawable.hb3,R.drawable.hb4,
            R.drawable.hb5,R.drawable.hb6,};

    int[] photoes8={R.drawable.lh1,R.drawable.lh2,
            R.drawable.lh3,R.drawable.lh4,
            R.drawable.lh5,R.drawable.lh6,};

    int[] photoes9={R.drawable.jsj1,R.drawable.jsj2,
            R.drawable.jsj3,R.drawable.jsj4,
            R.drawable.jsj5,R.drawable.jsj6,};

    int[] photoes10={R.drawable.xsh1,R.drawable.xsh2,
            R.drawable.xsh3,R.drawable.xsh4,
            R.drawable.xsh5,R.drawable.xsh6,};

    int[] photoes11={R.drawable.zyzxh1,R.drawable.zyzxh2,
            R.drawable.zyzxh3,R.drawable.zyzxh4,
            R.drawable.zyzxh5,R.drawable.zyzxh6,};

    int[] photoes12={R.drawable.zq1,R.drawable.zq2,
            R.drawable.zq3,R.drawable.zq4,
            R.drawable.zq5,R.drawable.zq6,};





    private int[]imgs={R.drawable.yumaoqiu, R.drawable.lanqiuc,
            R.drawable.shufashe, R.drawable.duzhexiehui,
            R.drawable.xinwenshe, R.drawable.wudaosheh,
            R.drawable.dianjinshe, R.drawable.huabanshe,
            R.drawable.lunhuashe, R.drawable.jishuanjishe,
            R.drawable.xueshenghui, R.drawable.zhiyuanzhexiehui,
            R.drawable.zuqiu,};
    private String[] names={"羽毛球社", "篮球社", "书法社", "读者协会",
            "新闻社", "舞蹈社", "电竞社", "滑板社","轮滑社","计算机协会","学生会","志愿者协会","足球社"};
    private int[] photo={R.string.ymq1,R.string.lqs1,R.string.sfs1,R.string.dzxh1,R.string.xws1,R.string.wds1,
                           R.string.djs1,R.string.hbs1,R.string.lhs1,R.string.jsjxh1,R.string.xsh1,R.string.zyzxh1,R.string.zqs1};


    private List<Map<String,Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < imgs.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("img", imgs[i]);
            map.put("name", names[i]);
            map.put("desc",photo[i]);
            if(i%13 == 0){
                map.put("photo",photoes0);
            }else if (i%13 == 1){
                map.put("photo",photoes1);
            }else if (i%13 == 2){
                map.put("photo",photoes2);
            }else if (i%13 == 3){
                map.put("photo",photoes3);
            }else if (i%13 == 4){
                map.put("photo",photoes4);
            }else if (i%13 == 5){
                map.put("photo",photoes5);
            }else if (i%13 == 6){
                map.put("photo",photoes6);
            }else if (i%13 == 7){
                map.put("photo",photoes7);
            }else if (i%13 == 8){
                map.put("photo",photoes8);
            }else if (i%13 == 9){
                map.put("photo",photoes9);
            }else if (i%13 == 10){
                map.put("photo",photoes10);
            }else if (i%13 == 11){
                map.put("photo",photoes11);
            }else if (i%13 == 12) {
                map.put("photo", photoes12);
            }
            list.add(map);
        }
        return list;
    }

    private List<Map<String,Object>>findNameData(String s){
        List<Map<String,Object>>list=new ArrayList<Map<String,Object>>();
        for (Map<String,Object>map:getData()){
            if (map.get("name").toString().indexOf(s)>=0){
                list.add(map);
            }
        }
        return list;
    }
    private RecyclerView recy_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shetuan_jingcai_main);
        recy_test=findViewById(R.id.recy_test);

        LinearLayoutManager lm1=new LinearLayoutManager(this);
        recy_test.setLayoutManager(lm1);
        JingcaiPhotoAdapter jingcaiPhotoAdapter=new JingcaiPhotoAdapter(getData());
        recy_test.setAdapter(jingcaiPhotoAdapter);


    }
}