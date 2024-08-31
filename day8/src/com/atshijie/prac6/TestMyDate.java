package com.atshijie.prac6;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate();

        MyDate.year = 2024;

        d1.month = 10;
        d1.day = 24;

        d2.month = 6;
        d2.day = 1;

        System.out.println(d1.month + "/" + d1.day + "/" + MyDate.year);
        System.out.println(d2.month + "/" + d2.day + "/" + MyDate.year);

    }
}
