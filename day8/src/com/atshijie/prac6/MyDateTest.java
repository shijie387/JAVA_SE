package com.atshijie.prac6;

public class MyDateTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "ashlee";

        MyDate d = new MyDate();
        employee.birthday = d;

        d.year = 2014;
        d.month = 3;
        d.day = 3;
        employee.birthday = d;

        System.out.println(d.date());
        System.out.println("employee.birthday = " + employee.birthday.date());
    }



}
