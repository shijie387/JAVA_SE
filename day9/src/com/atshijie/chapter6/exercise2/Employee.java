package com.atshijie.chapter6.exercise2;

//        （1）定义学生类`Student`
//        - 声明实例变量：姓名和成绩，私有化
//        - 声明无参和有参构造
//        - 声明get/set方法
//        - 声明实例方法：`String getInfo()`：用于返回学生对象的信息
//        - 姓名：xx，成绩：xx
//        （2）测试类`TestStudent`的main中创建一个可以装3个学生对象的数组，从键盘输入3个学生对象的信息，并且按照学生成绩排序，显示学生信息
public class Employee {
    private String name;
    private int score;

    public Employee() {
    }
    public Employee(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getInfo(){
        return "name: " + name + " " + "score: " +score;
    }
}
