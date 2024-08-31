package com.atshijie.casting2;
//（4）声明一个子类`HourEmployee`小时工，继承父类`Employee`
//
//        - 有属性，double类型的工作小时数`hours`和每小时多少钱`wage`
//        - 重写`earning()`方法，返回每小时多少钱 * 小时数作为实发工资
//        - 重写`public String getBasicInfo()`：返回姓名和时薪`wage`，工作小时数`hours`
public class HourEmployee extends Employee{
    double hours;
    double wage;

    public HourEmployee() {
    }

    public HourEmployee(String name,double hours, double wage) {
        super();
        this.hours = hours;
        this.wage = wage;
    }

    public double earning(){
        return wage*hours;
    }
    public String getBasicInfo(){
        return "name:" + getName() + ";" + "wage: " + wage + ";" + "hours: " + hours;
    }
}
