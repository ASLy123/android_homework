package com.example.hjschoolhelper_200301851;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bu_1,bu_2,bu_3,bu_4,bu_5,bu_6;
    private TextView text_3;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_long_in:
                Intent intent0 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent0);
                break;

            case R.id.menu_register:
                Intent intent1 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent1);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu_1=findViewById(R.id.bu_1);
        bu_2=findViewById(R.id.bu_2);
        bu_3=findViewById(R.id.bu_3);
        bu_4=findViewById(R.id.bu_4);
        bu_5=findViewById(R.id.bu_5);
        bu_6=findViewById(R.id.bu_6);
        text_3=findViewById(R.id.text_3);

        Intent intent=getIntent();//调用getIntent方法获取界面传递的intent
        String username=intent.getStringExtra("user");
//        text_3.setText("欢迎"+username+"登录系统");






        bu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,XszhinanActivity.class);
                startActivity(intent);
            }
        });




        bu_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DelicacyActivity.class);
                startActivity(intent);
            }
        });
        bu_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ShetuanMainActivity.class);
                startActivity(intent);
            }
        });
        bu_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,XueyuanJieshaoActivity.class);
                startActivity(intent);
            }
        });


    }
}