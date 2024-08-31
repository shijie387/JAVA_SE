package com.atshijie.hw2;
//2）程序员`Programmer`类，继承普通员工类
//
//        - 提供无参和有参构造器
//
//        - 重写`String toString()`方法，返回员工基本信息以及职位“程序员”
public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    public String toString() {
        return "programmer; " + super.say();
    }
}
