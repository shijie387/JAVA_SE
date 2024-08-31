package com.atshijie.casting1;

public class Rectangle extends Graphic{
//    3）子类矩形`com.atshijie.casting1.Rectangle`继承Graphic图形
//
//- 包含属性：`length、width`，属性私有化
//- 包含get/set方法
//- 重写`area()`求面积方法
//- 重写`perimeter()`求周长方法
//- 重写`toString()`方法，返回长和宽，面积、周长信息
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "com.atshijie.casting1.Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
    }
}
