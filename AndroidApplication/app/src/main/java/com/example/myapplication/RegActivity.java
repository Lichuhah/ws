package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegActivity extends AppCompatActivity {
    TextView txtLog, txtEmail, txtPas1, txtPas2;
    String login, email, password1, password2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        txtLog=findViewById(R.id.txtLog);
        txtEmail = findViewById(R.id.txtEmail);
        txtPas1=findViewById(R.id.txtPas1);
        txtPas2=findViewById(R.id.txtPas2);
    }
    public void onClickRegBtn(View view){
        login =  txtLog.getText().toString();
        email =  txtEmail.getText().toString();
        password1=txtPas1.getText().toString();
        password2=txtPas2.getText().toString();
        if(login.length()==0 || email.length()==0 || password1.length()==0 || password2.length()==0) {
        } else {
            if(password1.length()<7){
            } else {
                if(!password1.equals(password2)){
                } else {
                    //здесь код для всех проверок
                }
            }
        }

    }


}
