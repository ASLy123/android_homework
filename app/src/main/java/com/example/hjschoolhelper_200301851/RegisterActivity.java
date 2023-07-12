package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegisterActivity extends AppCompatActivity {
    private EditText ed_use,ed_pwd;
    private RadioGroup grade;
    private RadioButton ra_1,ra_2,ra_3;
    private Spinner spinner;
    private ImageView img_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed_use=findViewById(R.id.ed_use);
        ed_pwd=findViewById(R.id.ed_pwd);
        grade=findViewById(R.id.grade);
        ra_1=findViewById(R.id.ra_1);
        ra_2=findViewById(R.id.ra_2);
        ra_3=findViewById(R.id.ra_3);
        spinner=findViewById(R.id.spinner);
        img_register = findViewById(R.id.img_register);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str=((TextView)view).getText().toString();
                String atr1=spinner.getSelectedItem().toString();
                Toast.makeText(RegisterActivity.this,atr1,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        SharedPreferences sp_reg=getSharedPreferences("user_reg",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp_reg.edit();

        img_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("usr", ed_use.getText().toString());
                editor.putString("pwd", ed_pwd.getText().toString());
                RadioButton radioButton = grade.findViewById(grade.getCheckedRadioButtonId());
                editor.putString("grade", radioButton.getText().toString());
                editor.putString("loc", spinner.getSelectedItem().toString());

                List<CheckBox> chklist = new ArrayList<>();
                Set<String> hobest = new HashSet<>();

                for (CheckBox checkBox : chklist) {
                    if (checkBox.isChecked()) {
                        hobest.add(checkBox.getText().toString());
                    }
                }
                editor.putStringSet("hob", hobest);
                editor.commit();

                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                intent.putExtra("usr", "abcd");
                intent.putExtra("pwd", "1234");
                startActivity(intent);
            }
        });





    }
}