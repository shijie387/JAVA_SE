package com.atshijie.hw1;

public class TestLight {
    public static void main(String[] args) {
        Light l1 = new Light();
        Light l2 = new Light();
        Light l3 = new Light();

        l1.color = "red";
        l2.color = "green";
        l3.color = "yellow";

        l1.time = 60;
        l2.time = 90;
        l3.time = 3;

        System.out.println(l1.getInfo());
        System.out.println(l2.getInfo());
        System.out.println(l3.getInfo());
    }
}
