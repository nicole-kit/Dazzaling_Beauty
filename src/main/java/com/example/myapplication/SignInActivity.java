package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        textView= (TextView) findViewById(R.id.create);
        textView.setOnClickListener(this);

        login= (Button) findViewById(R.id.login);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==textView){
            Intent intent = new Intent(this,SignUpActivity.class);
            startActivity(intent);

        }
        else if (view==login){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}