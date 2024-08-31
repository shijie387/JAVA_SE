package com.atshijie.exer1;
//（1）声明父类：`Person`类
//
//        - 包含属性：姓名，年龄，性别，属性私有化，
//        - 包含get/set方法
//        - 提供无参构造public Person()
//        - 提供有参构造public Person(String name, int age, char gender)
//        - 重写toString方法：例如：姓名：张三，年龄：23，性别：男
public class Person {
    private String name;
    private int age;
    private char gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person() {
        super();
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
