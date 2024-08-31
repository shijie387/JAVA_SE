package com.atshijie.chapter6.exercise1;

//（1）声明一个银行储蓄卡`DepositCard`类，
//
//        - 包含静态变量：活期年利率，私有化
//        - 包含实例变量：账户，余额，私有化
//        - 包含无参和有参构造
//        - 包含所有成员变量的get/set方法
//        - 包含实例方法：`public void withdraw(double money)`，用于取款业务，
//        - 取款金额不能为负数，否则提示取款金额不能为负数
//        - 取款金额不能超过账户余额（这里暂不考虑利息），否则提示余额不足
public class DepositCard {
    private static double rate;
    private double account;
    private double balance;

    public DepositCard() {
    }

    public DepositCard(double account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        DepositCard.rate = rate;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double money){
        if (money<0 || money>balance){
            System.out.println("invalid");
            return;
        }
        balance = balance - money;
    }
    //        - 包含实例方法：`public void save(double money)`，用于存款业务，
//        - 存款金额不能为负数，否则提示存款金额不能为负数
//
//        - 包含实例方法：`public double interest()`，查询利息
//        - 利息（这里暂不考虑复利）的简单计算方法是 利率 * 余额
//
//        - 包含实例方法：`public String getInfo() `，返回储蓄卡信息
//        - 账号：xx，余额：xx，当前银行利率：xx，利息：xx
//

    public void save(double money){
        if (money<0){
            System.out.println("invalid");
            return;
        }
        balance+=money;
    }
    public double interest(){
        return balance*rate;
    }
    public String getInfo(){
        return account + ";" + balance + ";" + rate + ";" + interest();
    }
}
