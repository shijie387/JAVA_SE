package com.atshijie.exer1;

import java.util.EventListener;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Ashlee", 11, 'f');
        Student s = new Student("Alex", 10, 'm', 90);
        Teacher t = new Teacher("Amy", 20, 'f', 10000);

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
    }
}
