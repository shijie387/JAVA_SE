package com.atshijie.innerclass6;
//（1）声明一个Rest接口，包含抽象方法 void rest()
//
//        （2）在测试类中创建一个Rest数组，长度为3，用匿名内部类实现Rest接口，创建3个Rest接口的实现类对象放到数组中，遍历数组，调用rest方法。
//
//        第1个匿名内部类，实现rest方法，输出“休息就是睡大觉”
//
//        第2个匿名内部类，实现rest方法，输出“休息就是到处浪”
//
//        第3个匿名内部类，实现rest方法，输出“休息就是偷偷学习”
public interface Rest {
    void rest();
}
