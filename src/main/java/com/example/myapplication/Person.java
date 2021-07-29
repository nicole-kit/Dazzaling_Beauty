package com.example.myapplication;

import java.io.Serializable;

public class Person implements Serializable {
    private int Image;
    private String Name;
    private String SDes;
    private String LDes;

    public Person(int image, String name, String SDes,String LDes) {
        this.Image = image;
        this.Name = name;
        this.SDes = SDes;
        this.LDes = LDes;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSDes() {
        return SDes;
    }

    public void setSDes(String SDes) {
        this.SDes = SDes;
    }

    public String getLDes() {
        return LDes;
    }

    public void setLDes(String LDes) {
        this.LDes = LDes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Image=" + Image +
                ", Name='" + Name + '\'' +
                ", SDes='" + SDes + '\'' +
                ", LDes='" + LDes + '\'' +
                '}';
    }
}
