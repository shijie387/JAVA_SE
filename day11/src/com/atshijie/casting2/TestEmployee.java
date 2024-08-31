package com.atshijie.casting2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];
        all[0] = new SalaryEmployee("Alex",15000);
        all[1] = new Manager("Billy",20000,0.1);
        all[2] = new HourEmployee("Ashlee",50,100);

        for (int i = 0; i < all.length; i++) {
            if (all[i] instanceof HourEmployee){
                System.out.println("get cash at 5 of next month");
            }else {
                System.out.println("reunion at 15 of the next month");
            }
        }
    }
}

