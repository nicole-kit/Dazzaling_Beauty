package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    ArrayList<Person> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.listView);
        //create data
        arrayList =new ArrayList<>();
        Person person = new Person(R.drawable.item_1,"Art World","Do you love art? ","Do you love art?!! Well you are in the right place! Welcome to “Art world”. The challenge is very fun and simple where you need to do these steps:\n" +
                "1. Think about what a powerful female body looks like to you.\n" +
                "2.draw what you pictured in your mind, be creative, because you are!\n" +
                "3.Go to the camera and take a picture of your amazing drawing.\n" +
                "4.download the picture.\n" +
                "5.press on submit.\n");
        Person person2 =new  Person(R.drawable.item_2,"Dream Colors","What do colors mean?","Have you ever thought about colors and what they mean to you?!Colors make our life more cheerful and optimistic. Welcome to “Dream Colors” where in this challenge you need to do these steps:\n" +
                "1. Think about 3 colors that you truly love to see in the fashion industry(clothes).\n" +
                "2.now think about what each color means to you.\n" +
                "3.We want you to get creative and show us the meaning of each color you have chosen on a piece of paper.\n" +
                "4 Go to the camera and take a picture of your amazing masterpiece.\n" +
                "5.download the picture.\n" +
                "6.press on submit.\n");
        arrayList.add(person2);
        arrayList.add(person);


        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(personAdapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, SubmitActivity.class);
        intent.putExtra("person",(Person)arrayList.get(i));
        startActivity(intent);

    }
}