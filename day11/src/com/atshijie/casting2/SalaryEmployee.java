package com.atshijie.casting2;
//（2）声明一个子类`SalaryEmployee`正式工，继承父类`Employee`
//
//        - 增加属性，double类型的薪资`salary`，私有化，提供get/set方法
//        - 重写`earning()`方法：返回薪资作为实发工资
//        - 重写`public String getBasicInfo()`：返回姓名和月薪`salary`
public class SalaryEmployee extends Employee{
    private double salary;

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name,double salary) {
        super();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double earning(){
        return salary;
    }

    @Override
    public String getBasicInfo() {
        return "name:" + getName() + ", salary:" + salary;
    }
}
