package com.atshijie.hw1;

public class ArrayUtils {

//    public static void main(String[] args) {
//        int[] arr1 = {2,4,5,6,7,1};
//        System.out.println("sort_int:" + );
//    }
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){break;}
        }
    }

    public static void sort(double[] arr){
        for (int i = 1; i < arr.length; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){break;}
        }
    }

    public static void sort(char[] arr){
        for (int i = 1; i < arr.length; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){break;}
        }
    }

    public static String toString(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){str += arr[i] +"]";}
            else{str += arr[i] + ",";}
        }
        return str;
    }

    public static String toString(double[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){str += arr[i] +"]";}
            else{str += arr[i] + ",";}
        }
        return str;
    }

    public static String toString(char[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){str += arr[i] +"]";}
            else{str += arr[i] + ",";}
        }
        return str;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,1};
        System.out.println(toString(arr1));
    }

}
