package com.atshijie.recursion07;

public class RecursionPractice {

    public static void main(String[] args) {
        int amt = amount(1);
        System.out.println("amt = " + amt);

        int numStep = step(10);
        System.out.println("numStep = " + numStep);

        int product = multiple(10);
        System.out.println("product = " + product);
    }
    //1
    public static int amount(int days){
        if (days < 0 || days > 10){
            return 0;
        }
        if (days == 10){
            return 1;
        }
        return (amount(days+1) + 1) * 2;
    }
//    public static int amount1(int days){
//        int total = 1;
//        for(int i = 0; i < days; i++){
//            total+1
//        }
//    }

    //2
    public static int step(int n){
        if(n<1){return 0;}
        if(n==1 || n==2){return n;}

        return step(n-1) + step(n-2);
    }

    //3
    public static int multiple(int n){
        if(n<=1 || n > 100){return 1;}

        return n*multiple(n - 1);
    }
}
