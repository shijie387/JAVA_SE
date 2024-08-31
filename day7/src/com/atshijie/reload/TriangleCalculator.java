package com.atshijie.reload;

public class TriangleCalculator {
    public static double area(double base, double height){
        if(base>0 && height>0) {
            return base * height / 2;
        }
        return 0;
    }

    public static double area(double a, double b, double c){
        if (a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
            double p = (a+b+c)/2;
            return Math.sqrt(p * (p-a) * (p-b) * (p-c));
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(TriangleCalculator.area(3, 4));
        System.out.println(TriangleCalculator.area(3,4,5));
    }
}
