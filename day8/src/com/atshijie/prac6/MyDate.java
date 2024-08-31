package com.atshijie.prac6;

//在`com.atguigu.exer5`包中
//
//        （1）声明一个`MyDate`类型，有属性：年year(int类型)，月month(int类型)，日day(int类型)
//
//        （2）在测试类`TestMyDate`类中，创建两个日期对象，一个日期赋值为今年六一儿童节日期，一个日期赋值为今年程序员节日期，并显示
//
//        （3）声明另一个`Employee`类型，有属性：姓名name（String类型），生日birthday（MyDate类型）
//
//        （4）在测试类`TestEmployee`中的`main`中，创建两个员工对象，并为他们的姓名和生日赋值，并显示

public class MyDate {
    public static int year;
    public int month;
    public int day;

    public String date(){
        return month+"/"+day+"/"+year;
    }
}
