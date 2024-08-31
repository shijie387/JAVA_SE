package com.atshijie.casting2;
//- 有姓名`name`属性，私有化，提供get/set方法
//        - `public abstract double earning()`：代表实发工资
//        - `public abstract String getBasicInfo()`：代表基本信息
//        - 重写`public String toString()`：返回基本信息和实发工资
public abstract class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double earning();
    public abstract String getBasicInfo();

    @Override
    public String toString() {
        return "earning:" + earning() + ";" + "basic info: " + getBasicInfo();
    }
}
