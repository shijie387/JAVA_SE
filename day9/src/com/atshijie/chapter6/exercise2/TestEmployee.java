package com.atshijie.chapter6.exercise2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];

        e[0] = new Employee("Alex", 100);
        e[1] = new Employee("Ashlee", 81);
        e[2] = new Employee("Ali", 80);

        for (Employee employee : e) {
            System.out.println(employee.getInfo());
        }

        //sort
        for (int i= 1; i<e.length;i++){
            for (int j = 0; j < e.length - i; j++) {
                if (e[j].getScore() > e[j+1].getScore()){
                    Employee temp = e[j];
                    e[j] = e[j+1];
                    e[j+1] = temp;
                }
            }
        }

        for (Employee employee : e) {
            System.out.println(employee.getInfo());
        }
    }
}
