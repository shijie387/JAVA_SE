package com.atshijie.malefemale;
//（3）在`Woman`类中，包含
//
//        - 提供无参和有参构造
//
//        - 重写`eat()`：xx细嚼慢咽吃饭
//        - 增加` public void makeup()`：打印xx化妆
public class Woman extends Person{
    public Woman() {
    }
    public Woman(String name, int age, String job) {
        super(name, age, job);
    }
    public void eat(){
        System.out.println(getName()+"eat sth slowly..");
    }
    public void makeup(){
        System.out.println(getName()+"does makeup.");
    }
}
