package com.atshijie.prac3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.pi = 3.1415926;
        c1.radius = 1.5;

        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.getInfo());
    }
}
