package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DelicacyActivity extends AppCompatActivity {

    private int[]imgs={R.drawable.doujiaosuanrou,R.drawable.jipinzhouzi,
            R.drawable.kaipingyu,R.drawable.sanxiandoufu,
            R.drawable.xiaobaicairouwantang, R.drawable.xiaobaicairouwantang,
            R.drawable.xiaroujuan,R.drawable.xianxiangcuipichang,
            R.drawable.zhaxiaomayuan, R.drawable.zhenzhuwanzi,
            R.drawable.baicaifudai,R.drawable.paigutang,
            R.drawable.kujvbanhuashengmi,R.drawable.peigentudoujuan,
            R.drawable.tangculiji,R.drawable.sijiasuancaiyu,
            R.drawable.hongshaohuangguyu,R.drawable.boluoyu};
    private String[] names={"豆角酸肉","极品肘子","开屏鱼","三鲜豆腐",
            "小白菜肉丸汤","杏鲍菇炒荷兰豆","虾肉卷",
            "鲜香脆皮肠","炸小麻圆","珍珠丸子","百财福袋",
            "莲藕玉米排骨汤","苦苣拌花生米","培根土豆卷",
            "糖醋里脊","私家酸菜鱼","红烧黄骨鱼","菠萝鱼"};
    private String[] desc={"荤菜","荤菜","荤菜","素菜",
            "汤类","素菜","素菜",
            "素菜","素菜","荤菜","荤菜",
            "汤类","素菜","荤菜",
            "荤菜","荤菜","荤菜","荤菜"};
    private List<Map<String,Object>> getData(){
        List<Map<String,Object>>list=new ArrayList<>();
        for (int i=0;i<imgs.length;i++){
            Map<String,Object>map=new HashMap<>();
            map.put("img",imgs[i]);
            map.put("name",names[i]);
            map.put("desc",desc[i]);
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
            if (map.get("desc").toString().indexOf(s)>=0){
                list.add(map);
            }

        }
        return list;
    }
    private GridView grid_test;
    private EditText edt_testgrid;
    private Button btn_testgrid_query;
    private Spinner spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delicacy);
        grid_test=findViewById(R.id.grid_test);
        edt_testgrid=findViewById(R.id.edt_testgrid);
        btn_testgrid_query=findViewById(R.id.btn_testgrid_query);
        spinner2=findViewById(R.id.spinner2);


        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str=((TextView)view).getText().toString();
                String str1=spinner2.getSelectedItem().toString();//取
                String querystr=edt_testgrid.getText().toString();
                List<Map<String,Object>>querylist=findNameData(str);
                SimpleAdapter querygridAdpter=new SimpleAdapter(view.getContext(),querylist,R.layout.item_grid_test,
                        new String[]{"name","img","desc"},
                        new int[]{R.id.txt_grid_name,R.id.img_grid_test,R.id.txt_grid_desc});
                SimpleAdapter querygridAdpter1=new SimpleAdapter(getApplicationContext(),querylist,R.layout.item_grid_test,
                        new String[]{"name","img","desc"},
                        new int[]{R.id.txt_grid_name,R.id.img_grid_test,R.id.txt_grid_desc});

                grid_test.setAdapter(querygridAdpter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //获取数据源
        List<Map<String,Object>>gridlist=getData();
        //简单数据适配器，有五个参数,第一个参数是当前上下文，第二个参数是数据源（list类型），第三个参数是样式文件，第四个参数是数据源关键字，第五个参数是样式文件的控件
        SimpleAdapter gridAdpter=new SimpleAdapter(this,gridlist,R.layout.item_grid_test,
                new String[]{"name","img","desc"},
                new int[]{R.id.txt_grid_name,R.id.img_grid_test,R.id.txt_grid_desc});
        grid_test.setAdapter(gridAdpter);



        btn_testgrid_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String querystr=edt_testgrid.getText().toString();
                List<Map<String,Object>>querylist=findNameData(querystr);
                SimpleAdapter querygridAdpter=new SimpleAdapter(v.getContext(),querylist,R.layout.item_grid_test,
                        new String[]{"name","img","desc"},
                        new int[]{R.id.txt_grid_name,R.id.img_grid_test,R.id.txt_grid_desc});
                SimpleAdapter querygridAdpter1=new SimpleAdapter(getApplicationContext(),querylist,R.layout.item_grid_test,
                        new String[]{"name","img","desc"},
                        new int[]{R.id.txt_grid_name,R.id.img_grid_test,R.id.txt_grid_desc});

                grid_test.setAdapter(querygridAdpter);
            }
        });

    }
}
