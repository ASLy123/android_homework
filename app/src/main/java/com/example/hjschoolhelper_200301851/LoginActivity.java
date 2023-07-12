package com.example.hjschoolhelper_200301851;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText ed_use,ed_pwd;
    private Button bu_ok,bu_re;
    private TextView txt_register;
    private ImageView img_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed_use=findViewById(R.id.ed_use);
        ed_pwd=findViewById(R.id.ed_pwd);
        txt_register = findViewById(R.id.txt_login_register);
        img_login = findViewById(R.id.img_login);



        img_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr = ed_use.getText().toString();
                String pwd = ed_pwd.getText().toString();
                SharedPreferences sp_usr = getSharedPreferences("user_reg", MODE_PRIVATE);
                String username = sp_usr.getString("usr", null);
                String password = sp_usr.getString("pwd", null);
                Log.d("用户名", username);
                Log.d("密码", password);

                if (usr.equals(username) && pwd.equals(password)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("user", usr);
                    startActivity(intent);
                } else {
                    ed_use.setText("");
                    ed_pwd.setText("");
                }
            }
        });



        txt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}