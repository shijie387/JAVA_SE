package com.atshijie.hw2;
//4）架构师`Architect`类，继承设计师类
//
//        - 增加股票`block`属性
//        - 提供无参和有参构造器
//        - 重写`String toString()`方法，返回员工基本信息以及职位“架构师”和奖金、股票信息
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }
    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Architect{" +
                "stock=" + stock + "bonus=" + getBonus()+
                "} " + super.say();
    }
}
