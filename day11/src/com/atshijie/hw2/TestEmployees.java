package com.atshijie.hw2;

public class TestEmployees {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] =  new Employee(1,"段誉",22,3000);
        arr[1] =  new Architect(2,"令狐冲",32,18000,15000,2000);
        arr[2] =  new Programmer(3,"任我行",23,7000);
        arr[3] =  new Programmer(4,"张三丰",24,7300);
        arr[4] =  new Designer(5,"周芷若",28,10000,5000);

        for (int a = 0; a < arr.length; a++) {
            arr[a].setId(a+1);
            System.out.println(arr[a]);
        }
    }
}
