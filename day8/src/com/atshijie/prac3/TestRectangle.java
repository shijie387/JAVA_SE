package com.atshijie.prac3;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 2;
        r1.width = 1;
        double area1 = r1.length * r1.width;
        double perimeter1 = (r1.length + r1.width) * 2;

        Rectangle r2 = new Rectangle();
        r2.length = 2;
        r2.width = 3;
        double area2 = r2.length * r2.width;
        double perimeter2 = (r2.length + r2.width) * 2;

        System.out.println("len:" + r1.length + "   " + "width: " + r1.width + "   " + "area1: " + area1 + "   " + "perimeter: " + perimeter1);
        System.out.println("len:" + r2.length + "   " + "width: " + r2.width + "   " + "area1: " + area2 + "   " + "perimeter: " + perimeter2);
    }
}
