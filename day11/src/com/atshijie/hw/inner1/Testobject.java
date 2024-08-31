package com.atshijie.hw.inner1;
//
//        （1）编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法public void print()，输出尚硅谷。
//
//        （2）请编写代码调用这个方法。
public class Testobject {
    public static void main(String[] args) {
        new Object(){
            public void print(){
                System.out.println("sgg");
            }
        }.print();
    }
}
