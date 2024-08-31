package com.atshijie.classpractice;

public class Practice {

    public static void change(int[] arr){
        arr = new int[]{2,3,4};
       // return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
