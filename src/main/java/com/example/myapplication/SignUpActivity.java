package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText SufName,SulName,SuEmail,SuPass;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        SufName = findViewById(R.id.SufName);
        SulName = findViewById(R.id.SulName);
        SuEmail = findViewById(R.id.SuEmail);
        SuPass = findViewById(R.id.SuPass);
        register = findViewById(R.id.register);
        register.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (register == v){
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}