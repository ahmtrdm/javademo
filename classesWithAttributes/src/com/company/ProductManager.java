package com.company;

public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("product added " + product.getName());
    }

    //useless when needs adding new fileds or remove any
    public void Add(int id, String name, String description, int stock, double price){

    }
}
