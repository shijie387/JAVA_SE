package com.atshijie.malefemale;
//（1）在`Person`类中，包含
//
//        - 属性：姓名`name`，年龄`age`，职业`job`
//        - 提供无参和有参构造
//        - `public void eat()`：打印xx吃饭，xx代表姓名
//        - `public void toilet()`：打印xx上洗手间
//        - 重写`public String toString()`：返回姓名、年龄、职业信息。
public class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void eat(){
        System.out.println(name + "is eating.");
    }
    public void toilet(){
        System.out.println(name + "is going to the bathroom.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
