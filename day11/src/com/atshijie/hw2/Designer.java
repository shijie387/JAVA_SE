package com.atshijie.hw2;
//（3）设计师`Designer`类，继承程序员类
//
//        - 增加奖金`bonus`属性
//        - 提供无参和有参构造器
//        - 重写`String toString()`方法，返回员工基本信息以及职位“设计师”和奖金信息
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "bonus=" + bonus +
                "} " + super.say();
    }
}
