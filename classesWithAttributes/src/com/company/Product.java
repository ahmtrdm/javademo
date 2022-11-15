package com.company;

public class Product {
    //attribute & field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String color;
    private String key;

    //constructor
    public Product(int id, String name, String description, double price, int stock, String color, String key) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.color = color;
        this.key = key;
    }

    //empty constructor
    public Product(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKey() {
        return this.id + this.name.substring(0,1);
    }

}
