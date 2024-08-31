package com.atshijie.exercise2;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3,4,5);
        Triangle t3 = new Triangle(2,3,-3);

        System.out.println(t1.getInfo());
        System.out.println(t2.getInfo());
        System.out.println(t3.getInfo());
    }
}
