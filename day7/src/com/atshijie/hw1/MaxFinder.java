package com.atshijie.hw1;

public class MaxFinder {

    public static void main(String[] args) {
        System.out.println(findMax(1,2,3,4));
    }
    public static int findMax(int... nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
