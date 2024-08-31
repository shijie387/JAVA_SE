package com.atshijie.hw2;

//我们要做一个商品信息管理系统，目前需要展示的是商品的编号、名称、价格、库存等信息，请设计商品类，并创建几个商品对象来展示其信息。
//
//提示：在`com.atguigu.homework2`包中声明类
public class Product {
    public int serialNum;
    public String name;
    public double price;
    public int inventory;

    public String getInfo(){
        return "serialNum: " + serialNum + ";"
                + "name: " + name + ";"
                + "price: " + price + ";"
                + "inventory: " + inventory;
    }
}
