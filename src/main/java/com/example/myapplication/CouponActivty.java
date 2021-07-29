package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.Random;

public class CouponActivty extends AppCompatActivity {


    Random r = new Random();
    int cp = r.nextInt(100000);
    private TextView coupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_activty);
        coupon = findViewById(R.id.coupon);
        String text = coupon.getText().toString() + " " + cp;
        coupon.setText(text);
    }
}