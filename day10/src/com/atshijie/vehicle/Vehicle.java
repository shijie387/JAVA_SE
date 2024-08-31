package com.atshijie.vehicle;

public abstract class Vehicle {
//    （1）声明抽象类`com.atshijie.vehicle.Vehicle`交通工具
//
//- 包含私有的属性`wheels`，代表轮子的数量
//- 包含有参构造
//- 包含抽象方法`public abstract void drive()`
//            - 重写toString()：返回轮子的数量
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "com.atshijie.vehicle.Vehicle{" +
                "wheels=" + wheels +
                '}';
    }
}
