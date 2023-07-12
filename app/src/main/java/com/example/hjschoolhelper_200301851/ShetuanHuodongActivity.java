package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShetuanHuodongActivity extends AppCompatActivity {

    int[] photoes0={R.drawable.ymq1};
    int[] photoes1 ={R.drawable.lq1};
    int[] photoes2={R.drawable.sf1 };

    int[] photoes3 ={R.drawable.dz1};
    int[] photoes4={R.drawable.xw1};






    private int[]imgs={R.drawable.yumaoqiu, R.drawable.lanqiuc,
            R.drawable.shufashe, R.drawable.duzhexiehui,
            R.drawable.xinwenshe};
    private String[] names={"羽毛球社", "篮球社", "书法社", "读者协会","足球社"};
    private int[] photo={R.string.ymq1,R.string.lqs1,R.string.sfs1,R.string.dzxh1,R.string.xws1};


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
        setContentView(R.layout.activity_shetuan_huodong);
        recy_test=findViewById(R.id.recy_test);

        LinearLayoutManager lm1=new LinearLayoutManager(this);
        recy_test.setLayoutManager(lm1);
        HuodongPhotoAdapter huodongPhotoAdapter=new HuodongPhotoAdapter(getData());
        recy_test.setAdapter(huodongPhotoAdapter);


    }
}