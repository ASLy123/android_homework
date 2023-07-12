package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class XszhinanActivity extends AppCompatActivity {
    private TextView txt_1,txt_2,txt_3,txt_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xszhinan);
        txt_1=findViewById(R.id.txt_1);
        txt_2=findViewById(R.id.txt_2);
        txt_3=findViewById(R.id.txt_3);
        txt_4=findViewById(R.id.txt_4);

        txt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XszhinanActivity.this, LiuchengActivity.class);
                startActivity(intent);
            }
        });
        txt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XszhinanActivity.this,SwbanliActivity.class);
                startActivity(intent);
            }
        });
        txt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XszhinanActivity.this, SheshiActivity.class);
                startActivity(intent);
            }
        });

    }
}