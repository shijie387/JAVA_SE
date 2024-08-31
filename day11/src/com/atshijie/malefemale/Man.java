package com.atshijie.malefemale;
//（2）在`Man`类中，包含
//
//        - 提供无参和有参构造
//
//        - 重写`eat()`：xx狼吞虎咽吃饭
//        - 增加 ` public void smoke()`：打印xx抽烟
public class Man extends Person{

    public Man() {
    }

    public Man(String name, int age, String job) {
        super(name, age, job);
    }
    public void eat(){
        System.out.println(getName()+"devoured sth..");
    }
    public void smoke(){
        System.out.println(getName()+"smokes");
    }
}
