package com.atshijie.hw1;

public class Practice {

    public static void main(String[] args) {
        System.out.println("general formula term of 10：" + f(10));
    }
    public static long f(int n){
//        if (n<=1){return 1;}
        if (n==1){return 1;}
        if(n<1){return 0;}

        return f(n - 1) + n;
    }
}
