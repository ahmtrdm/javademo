package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product = new Product();
        product.setName("laptop");
        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
