package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class XueyuanJieshaoActivity extends AppCompatActivity {
    private TextView txt_jt, txt_gg, txt_qh, txt_wg, txt_hh, txt_jy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xueyuan_jieshao);
        txt_jt=findViewById(R.id.txt_jt);
        txt_gg=findViewById(R.id.txt_gg);
        txt_qh=findViewById(R.id.txt_qh);
        txt_wg=findViewById(R.id.txt_wg);
        txt_hh=findViewById(R.id.txt_hh);
        txt_jy=findViewById(R.id.txt_jy);


        txt_jt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XueyuanJieshaoActivity.this,YuanxiMainActivity.class);
                startActivity(intent);
            }
        });
        txt_gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XueyuanJieshaoActivity.this,GongguiActivity.class);
                startActivity(intent);
            }
        });
        txt_qh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XueyuanJieshaoActivity.this,QihangActivity.class);
                startActivity(intent);
            }
        });
        txt_wg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XueyuanJieshaoActivity.this,WuguanActivity.class);
                startActivity(intent);
            }
        });
        txt_hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XueyuanJieshaoActivity.this,HanghaiActivity.class);
                startActivity(intent);
            }
        });
        txt_jy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XueyuanJieshaoActivity.this,JianyiActivity.class);
                startActivity(intent);
            }
        });


    }
}