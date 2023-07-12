package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LiuchengActivity extends AppCompatActivity {
    private TextView text_1,text_2,text_3,text_4,text_5,text_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liucheng);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        text_4=findViewById(R.id.text_4);
        text_5=findViewById(R.id.text_5);
        text_6=findViewById(R.id.text_6);


        text_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog text_1=new AlertDialog.Builder(LiuchengActivity.this).setTitle("报道").setMessage("1.到测试长廊领报道流程表\n"+
                        "2.领取校园一卡通\n"+
                        "3.确认是否线上缴费，若无请前往体育馆缴费\n").create();
                text_1.show();
            }
        });

        text_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog text_2=new AlertDialog.Builder(LiuchengActivity.this).setTitle("缴费").setMessage("1.到体育馆缴费\n"+
                        "2.线下预交教材费\n"+
                        "3.线下缴纳服装费\n").create();
                text_2.show();
            }
        });


        text_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog text_3=new AlertDialog.Builder(LiuchengActivity.this).setTitle("办理住宿").setMessage("1.凭流程表到所在宿舍楼\n"+
                        "2.领取房间钥匙\n"+"3.入住\n").create();
                text_3.show();
            }
        });

        text_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog text_4=new AlertDialog.Builder(LiuchengActivity.this).setTitle("发放物资").setMessage("1.到图书信息大楼架空层\n"+
                        "2.领取运动服及实训服装\n").create();
                text_4.show();
            }
        });

        text_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog text_5=new AlertDialog.Builder(LiuchengActivity.this).setTitle("开学事项").setMessage("1.请保存好所以缴纳费用的收据和票证\n"+
                        "2.疫情期间学校实行封闭式管理所有学生一律住校\n"+
                        "3.请新生遵守校纪校规，违反校纪校规者、情节严重者依规取消学籍\n"+
                        "4.请妥善保管好现金、手机、个人证件等个人物品\n"+
                        "5.校园一卡通用于校内用餐、图书借阅、宿舍出入门禁等，请妥善保管，及时充值").create();
                text_5.show();
            }
        });

        text_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog text_6=new AlertDialog.Builder(LiuchengActivity.this).setTitle("军训").setMessage("1.注意补充水分\n"+
                        "2.注意防晒\n"+
                        "3.注意饮食\n"+
                        "4.注意休息和睡眠充足").create();
                text_6.show();
            }
        });
    }
}