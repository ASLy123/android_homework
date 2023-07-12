package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShetuanMainActivity extends AppCompatActivity {
    private Button js_test,hd_test,jc_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shetuan_main);
        js_test=findViewById(R.id.js_test);
        hd_test=findViewById(R.id.hd_text);
        jc_test=findViewById(R.id.jc_test);

        js_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShetuanMainActivity.this,ShetuanActivity.class);
                startActivity(intent);
            }
        });
        jc_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShetuanMainActivity.this,ShetuanJingcaiMainActivity.class);
                startActivity(intent);
            }
        });
        hd_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShetuanMainActivity.this,ShetuanHuodongActivity.class);
                startActivity(intent);
            }
        });
    }
}