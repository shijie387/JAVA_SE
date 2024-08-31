package com.atshijie.exercise2;
//（1）定义三角形类`Triangle`，
//
//        - 声明实例变量a,b,c，代表三角形三条边
//        - 声明无参构造 `public Triangle()`
//        - 声明有参构造`public Triangle(double a, double b, double c)`
//        - 如果a,b,c的值无法构成三角形，给出错误体现，并且保留a，b，c为默认值0
//
//        - 声明实例方法`public double area()`，返回三角形面积（提示：海伦公式）
//        - 声明实例方法`public double perimeter()`：返回三角形周长
//        - 声明实例方法`public String getInfo()`：返回三角形的三条边，面积和周长
//
//        （2）测试类`TestTriangle`的main中创建一个三角形对象，并调用相应方法
public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        if (a<0 || b<0 || c<0 || a+b < c || a+c < b || b+c<a){
            System.out.println("invalid");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double perimeter(){
        return a+b+c;
    }

    public String getInfo(){
        return a+","+b+","+c+","+area()+","+perimeter();
    }
}

