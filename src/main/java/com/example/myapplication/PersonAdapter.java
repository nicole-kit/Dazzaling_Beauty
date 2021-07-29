package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {
    private Context mContext;
    private int mResource;

    public PersonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(mResource, parent, false);
        }
        Person person = getItem(position);
        if (person != null) {
            ImageView imageView = convertView.findViewById(R.id.image);
            TextView txtName = convertView.findViewById(R.id.txtName);
            TextView txtDes = convertView.findViewById(R.id.txtDes);
            imageView.setImageResource(person.getImage());
            txtName.setText(person.getName());
            txtDes.setText(person.getSDes());
        }
        return convertView;

    }



}

