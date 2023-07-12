package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Map;

public class ShetuanJieshaoActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView7,textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shetuan_jieshao);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Map<String, Object>shetuanjieshao=(Map<String, Object>)bundle.getSerializable("shetuanjieshao");

        imageView=findViewById(R.id.imageView);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);

        imageView.setImageResource((Integer) shetuanjieshao.get("img"));
        textView7.setText(shetuanjieshao.get("name").toString());
        textView8.setText((Integer) shetuanjieshao.get("desc"));



    }
}