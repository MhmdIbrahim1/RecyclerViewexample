package com.example.recyclerviewexample;


public class Shoe {
    private int imageResId;
    private String name;
    private String size;
    private String price;

    public Shoe(int imageResId, String name,  String size, String price) {
        this.imageResId = imageResId;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getPrice() {
        return price;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}