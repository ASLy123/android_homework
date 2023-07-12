package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SheshiActivity extends AppCompatActivity {
    private int[] imgs = {R.drawable.tiyuguan, R.drawable.lanqiuc,
            R.drawable.tushuguan, R.drawable.zuqiuchang,
            R.drawable.shitang, R.drawable.sushe,
            R.drawable.jiaoxuelou, R.drawable.pimgpangqiuchang,};
    private String[] names = {"体育馆", "篮球场", "图书馆", "足球场",
            "食堂", "宿舍", "教学楼", "乒乓球场"};
    private String[] descs = {"体育馆，室内进行体育比赛，\n 体育锻炼 亦或是举办演唱会的建筑。\n", "篮球比赛场地是一个长方形的坚实平面，\n篮球场地长28米，宽15米。\n",
            "图书馆是学校的文献信息中心，\n是学校信息化和社会信息化的重要基地。\n", "足球场地比赛场地必须是长方形，\n圆周不长于70厘米不短于60厘米。\n",
            "食堂是为供应其内部职工、 学生 \n等就餐的场所。", "学校宿舍床位也是不同，有6人间、8人间，\n但大多数大学里面是8人间，而且多数是上下铺。",
            "教学楼主要由教室、实验室、教研室、\n图书阅览室、多功能会议室等组成。", "乒乓球 场为长方形，其长度不得小于14米，\n宽不得小于7米，天花板高度不得低于4米。"};




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
    private EditText edt_test_list;
    private Button btn_test_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheshi);
        list_test = findViewById(R.id.list_test);
        edt_test_list = findViewById(R.id.edt_test_list);
        btn_test_list = findViewById(R.id.btn_test_list);



        TestAdapter testAdapter = new TestAdapter(this, getData());
        list_test.setAdapter(testAdapter);

        List<Map<String, Object>> gridlist = getData();
        SimpleAdapter gridAdpter = new SimpleAdapter(this, gridlist, R.layout.item_list_test,
                new String[]{"name", "img","desc"},
                new int[]{R.id.txt_item_list_name, R.id.img_item_list,R.id.txt_item_list_desc});
        list_test.setAdapter(gridAdpter);

        btn_test_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String querystr = edt_test_list.getText().toString();
                List<Map<String, Object>> querylist = findNameData(querystr);
                SimpleAdapter querygridAdpter = new SimpleAdapter(v.getContext(), querylist, R.layout.item_list_test,
                        new String[]{"name", "img"},
                        new int[]{R.id.txt_item_list_name, R.id.img_item_list});
                SimpleAdapter querygridAdpter1 = new SimpleAdapter(getApplicationContext(), querylist, R.layout.item_list_test,
                        new String[]{"name", "img"},
                        new int[]{R.id.txt_item_list_name, R.id.img_item_list});

                list_test.setAdapter(querygridAdpter);
            }
        });
    }
}