package com.atshijie.prac3;

//在`com.atguigu.exer3`包中
//
//        （1）声明一个圆的图形类`Circle`，包含
//
//        - 静态变量：圆周率 pi
//        - 实例变量/属性：半径
//        - 实例方法：public double area()，求面积
//        - 实例方法：public double perimeter()，求周长
//        - 实例方法：public String getInfo()，返回圆对象信息：圆周率：xx，半径：xx，面积：xx，周长：xx
//
//        （2）在测试类`TestCircle`的`main`方法中，创建2个圆类的对象，并给两个圆对象的半径属性赋值，最后输出两个圆的半径、周长和面积值。
//
//        圆周率赋值为：3.1415926
public class Circle {
    public static double pi;
    public double radius;

    public double area(){
        double area = pi * radius * radius;
        return area;
    }

    public double perimeter(){
        double peri = 2 * pi * radius;
        return peri;
    }

    public String getInfo(){
        return pi + " " + radius + " " + area() + " " + perimeter();
    }
}
