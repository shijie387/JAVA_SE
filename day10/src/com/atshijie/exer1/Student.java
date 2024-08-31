package com.atshijie.exer1;
//2）声明子类：`Student`类，继承Person类
//
//        - 新增属性：score成绩，属性私有化，
//        - 包含get/set方法
//        - 提供无参构造public Student()
//        - 提供有参构造public Student(String name, int age, char gender, int score)
//        - 重写toString()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89
public class Student extends Person{
    private double score;
    public Student(double score) {
        super();
        this.score = score;
    }
    public Student(String name, int age, char gender, double score) {
        super(name, age, gender);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +
                "score=" + score +
                '}';
    }
}
