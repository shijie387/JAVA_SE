package com.atshijie.casting1;

public class Circle extends Graphic{
//    - 包含属性：`radius`，属性私有化
//- 包含get/set方法
//- 重写`area()`求面积方法
//- 重写`perimeter()`求周长方法
//- 重写`toString()`方法，返回圆的半径，面积和周长
    private double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return radius*radius*Math.PI;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "com.atshijie.casting1.Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
