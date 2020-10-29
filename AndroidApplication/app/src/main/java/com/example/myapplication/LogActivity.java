package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    TextView txtLog, txtPas, txtState;
    String login, password;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        txtLog = findViewById(R.id.txtLog);
        txtPas = findViewById(R.id.txtEmail);
        txtState=findViewById(R.id.txtState);

    }
    public void onClickLogBtn(View view){
       login =  txtLog.getText().toString();
       password =  txtPas.getText().toString();
       if(login.length()>0 && password.length()>0) {
           if (login.equals("ff") && password.equals("ff")) {
               txtState.setText("Вход успешен");
           } else {
               txtState.setText("Данные для входа неверны");
           }
       } else {
           txtState.setText("Пожалуйста, заполните все поля");
       }

    }

    public void onClickRegBtn(View view){
        Intent intent = new Intent(LogActivity.this, RegActivity.class);
        startActivity(intent);
    }
}
