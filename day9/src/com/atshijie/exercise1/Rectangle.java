package com.atshijie.exercise1;

//        （1）定义矩形类`Rectangle`，
//
//        - 声明实例变量：长`length`和宽`width`
//        - 声明无参构造：`public Rectangle()`
//        - 声明有参构造：`public Rectangle(double length, double width)`
//        - 如果length或width为负数，则提示错误信息，并且length和width仍然为默认值0
//
//        - 声明实例方法`public double area()`，返回矩形面积
//        - 声明实例方法`public double perimeter()`：返回矩形的周长
//        - 声明实例方法`public String getInfo()`：返回矩形的长、宽、面积、周长信息
//
//        （2）定义测试类`TestRectangle`，在main方法中，分别用无参构造和有参构造创建2个矩形对象，并为长和宽赋值，最后输出信息
public class Rectangle {
    public double length;
    public double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        if (length<0 || width < 0){
            System.out.println("invalid");
        }else {
            this.length = length;
            this.width = width;}
    }

    public double area(){
        return this.length*this.width;
    }

    public double perimeter(){
        return (length + width)*2;
    }

    public String getInfo(){
        return width + "  " + length +"  "+ perimeter() + "  ";
    }

}