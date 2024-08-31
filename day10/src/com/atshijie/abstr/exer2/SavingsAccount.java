package com.atshijie.abstr.exer2;

import java.security.cert.TrustAnchor;

//2）声明银行储蓄卡子类`SavingsAccount`，重写抽象方法
//
//        - `public boolean withdraw(double money)`：取款，
//        - 取款金额不能为负数，否则提示取款失败，金额不能为负数
//        - 取款金额不能超过账户余额，否则提示取款失败，余额不足
//        - `public boolean save(double money)`：存款，
//        - 存款金额不能为负数，否则提示存款失败，金额不能为负数
public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
    }

    public SavingsAccount(String id, double balance) {
        super(id, balance);
    }

    @Override
    public boolean withdraw(double money){
        if (money<0){
            System.out.println("negative; failed");
            return false;
        }
        if (money> getBalance()){
            System.out.println("below your balance; failed");
            return false;
        }
        setBalance(getBalance()-money);
        return true;
    }

    @Override
    public boolean save(double money) {
        if (money<0){
            System.out.println("negative; failed");
            return false;
        }
        setBalance(getBalance()+money);
        return true;
    }
}
