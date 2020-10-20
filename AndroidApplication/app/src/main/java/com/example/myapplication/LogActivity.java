package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    TextView txtLog, txtPas;
    String login, password;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        txtLog = findViewById(R.id.txtLog);
        txtPas = findViewById(R.id.txtEmail);

    }
    public void onClickLogBtn(View view){
       login =  txtLog.getText().toString();
       password =  txtPas.getText().toString();
        if(login.equals("ff") && password.equals("ff")){
            Intent intent = new Intent(LogActivity.this, RegActivity.class);
            startActivity(intent);
        }

    }
}
