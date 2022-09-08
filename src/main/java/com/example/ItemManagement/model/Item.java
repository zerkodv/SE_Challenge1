package com.example.ItemManagement.model;

public class Item {
    public Item(){

    }
    private String id;
    private String title;
    private String desc;
    private String imagePath;
    private double price;

    public Item(String id, String title, String desc, String imagePath, double price) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.imagePath = imagePath;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", price=" + price +
                '}';
    }
}
