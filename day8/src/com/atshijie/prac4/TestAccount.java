package com.atshijie.prac4;

public class TestAccount {
    public static void main(String[] args) {
        Account.rate = 0.035;

        Account a1 = new Account();
        Account a2 = new Account();

        a1.id = 1234543L;
        a2.id = 3234543L;
        a1.balance = 2244555;
        a2.balance = 1937383;

        double interest1 = a1.balance * Account.rate;
        double interest2 = a2.balance * Account.rate;

        System.out.println(a1.id + "  " + a1.balance + " " + interest1);
        System.out.println(a2.id + "  " + a2.balance + " " + interest2);
    }
}
