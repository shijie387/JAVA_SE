package com.atshijie.abstr.exer2;
//3）声明一个银行信用卡类`CreditCardAccount`，继承银行卡类
//        - 重写`public boolean withdraw(double money)`，可透支，
//        - 取款金额不能为负数，否则提示取款/支付失败，金额不能为负数
//        - 取款金额超过账户余额+本月还可透支额度，提示取款/支付失败，本次取款/支付金额超过账号余额与可透支额度。本月还可透支额度=每月可透支总额度 - 每月可透支总额度。
//        - 取款金额在本月还可透支额度范围内，继续透支
//        - 取款金额超过本月还可透支额度范围，但是取款金额在账户余额+本月还可透支额度范围内，那么先使用完透支，再用账户余额。
//        - 重写`public boolean save(double money)`，
//        - 存款金额不能为负数，否则提示存款/还款失败，金额不能为负数
//        - 存款金额只够偿还部分已透支金额
//        - 存款金额除了偿还所有透支金额，还有剩余，剩余部分就加到账号余额中
//        - 重写toString()方法，返回信用卡账号的详细信息，例如：账号：xx，余额：xx，每月可透支总额度：xx，本月已透支金额：xx
public class CreditCardAccount extends BankAccount {
    public double maxOverdraft;
    public double overdraftAmount;

    public CreditCardAccount(double maxOverdraft, double overdraftAmount) {
        this.maxOverdraft = maxOverdraft;
        this.overdraftAmount = overdraftAmount;
    }

    public CreditCardAccount(String id, double balance, double maxOverdraft, double overdraftAmount) {
        super(id, balance);
        this.maxOverdraft = maxOverdraft;
        this.overdraftAmount = overdraftAmount;
    }

    public double getMaxOverdraft() {
        return maxOverdraft;
    }

    public void setMaxOverdraft(double maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    @Override
    public boolean withdraw(double money) {
        if(money<0){
            System.out.println("negative; failed");
            return false;
        }
        if(money>maxOverdraft-overdraftAmount+getBalance()){
            System.out.println("取款/支付失败，本次取款/支付金额超过账号余额与可透支额度");
            return false;
        }
        if(money<maxOverdraft-overdraftAmount){
            //如果取款金额小于允许的透支额度，增加透支金额
            overdraftAmount+=money;
        }else{
            // 如果取款金额大于允许的透支额度，但超出部分小于等于账户余额，扣除相应金额
            double amount = money - (maxOverdraft-overdraftAmount);
            setBalance(getBalance()-amount);
            overdraftAmount = maxOverdraft;
        }
        return true;
    }

    @Override
    public boolean save(double money) {
        if(money<0){
            System.out.println("存款/还款失败，金额不能为负数");
            return false;
        }
        if(money <= overdraftAmount){
            // 如果存款金额小于等于当前透支金额，减少透支金额
            overdraftAmount -= money;
        }else{
            // // 如果存款金额大于当前透支金额，增加账户余额，透支金额归零
            double amount = money - overdraftAmount;
            setBalance(getBalance() + amount);
            overdraftAmount = 0;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CreditCardAccount{" +
                "maxOverdraft=" + maxOverdraft +
                ", overdraftAmount=" + overdraftAmount +
                "} " + super.toString();
    }
}
