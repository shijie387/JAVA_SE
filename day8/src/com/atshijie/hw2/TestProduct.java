package com.atshijie.hw2;

public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product();

        p.inventory = 100;
        p.name = "clothing";
        p.serialNum = 11233444;
        p.price = 100;

        System.out.println( p.getInfo());
    }
}
