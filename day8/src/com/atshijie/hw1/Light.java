package com.atshijie.hw1;
//在`com.atguigu.homework1`包中
//
//- 声明`Light`交通灯类，
//  - 包含颜色`color`和时间`time`属性，
//  - 包含`public String getInfo()`方法，返回xx颜色的灯亮xx秒。
//
//- 声明`TestLight`测试类的main方法中创建3个交通灯对象，分别红色60秒，绿色90秒，黄色3秒。
public class Light {
    public String color;
    public double time;

    public String getInfo(){
        return "The " + color + " light last " + time + "s";
    }
}
