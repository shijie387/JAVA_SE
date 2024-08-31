package com.atshijie.prac5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.birthday = new MyDate();
        e2.birthday = new MyDate();

        MyDate.year = 2004;
        e1.birthday.month = 2;
        e2.birthday.month = 3;
        e1.birthday.day = 2;
        e2.birthday.day = 3;

        e1.name = "Amy";
        e2.name = "Ashlee";

        System.out.println(e1.name + ":" + e1.birthday.month + "/" + e1.birthday.day + "/" + MyDate.year);
        System.out.println(e2.name + ":" + e2.birthday.month + "/" + e2.birthday.day + "/" + MyDate.year);

    }
}
