package com.atshijie.chapter6.exercise1;
//        （2）声明测试类`TestDepositCard`的main方法中创建两个储蓄卡对象
//        - 利率：0.002
//        - 卡号：11111111，余额：80000，进行存款8888，取款66666，然后分别输出信息
//        - 卡号：2222222，余额：50000，进行存款8888，取款66666，然后分别输出信息
public class TestDepositCard {
    public static void main(String[] args) {
        DepositCard dc1 = new DepositCard(1111111, 80000);
        DepositCard dc2 = new DepositCard(2222222, 50000);

        DepositCard.setRate(0.002);
        dc1.save(8888);
        dc2.save(8888);
        dc1.withdraw(66666);
        dc2.withdraw(66666);

        System.out.println(dc1.getInfo());
        System.out.println(dc2.getInfo());
    }
}
