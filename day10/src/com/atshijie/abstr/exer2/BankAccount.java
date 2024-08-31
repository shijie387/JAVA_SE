package com.atshijie.abstr.exer2;
//（1）声明一个银行卡`BankAccount`类，
//
//        - 包含属性：账号`id`，余额`balance`，属性私有化
//        - 包含无参和有参构造
//        - 包含`public double getBlance()`方法：用于查询余额
//        - 包含`protected void setBalance(double balance)`方法：用于子类修改账户余额
//        - 包含抽象方法
//        - `public abstract boolean withdraw(double money)`：取款
//        - `public abstract boolean save(double money)`：存款
//
//        - 重写`toString()`方法，返回账号详细信息，例如：账号：xx，余额：xx
public abstract class BankAccount {
    private String id;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract boolean withdraw(double money);
    public abstract boolean save(double money);

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
