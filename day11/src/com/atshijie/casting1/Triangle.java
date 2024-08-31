package com.atshijie.casting1;

public class Triangle extends Graphic{
//    （4）子类三角形`com.atshijie.casting1.Triangle`继承Graphic图形
//
//- 包含属性：a,b,c，代表三边，属性私有化
//- 包含get/set方法
//
//- 重写`area()`求面积方法
//- 重写`perimeter()`求周长方法
//- 重写`toString()`方法，返回a,b,c三边长，面积、周长信息
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double area(){
        double p =(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double perimeter(){
        return a+b+c;
    }

    @Override
    public String toString() {
        return "com.atshijie.casting1.Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} " + super.toString();
    }
}
