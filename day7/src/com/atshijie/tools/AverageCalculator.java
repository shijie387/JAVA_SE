package com.atshijie.tools;

public class AverageCalculator {
    public static double average(int... nums){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double v1 = average(1,2,3);
        System.out.println("v1 = " + v1);

        int[] arr = {1,2,3};
        double v2 = average(arr);
        System.out.println("v2 = " + v2);
    }
}
