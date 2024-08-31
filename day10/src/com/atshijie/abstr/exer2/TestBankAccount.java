package com.atshijie.abstr.exer2;

public class TestBankAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("11111111",5000);
        System.out.println(s);
        System.out.println("取款3000" + (s.withdraw(3000)?"成功":"失败") + "，" + s);
        System.out.println("取款4000" + (s.withdraw(4000)?"成功":"失败") + "，" + s);
        System.out.println("存款5000" + (s.save(5000)?"成功":"失败") + "，" + s);
        System.out.println();

        CreditCardAccount c = new CreditCardAccount("22222222",0,3000,0);
        System.out.println(c);
        System.out.println("取款2000" + (c.withdraw(2000)?"成功":"失败") + "，" + c);
        System.out.println("取款4000" + (c.withdraw(4000)?"成功":"失败") + "，" + c);
        System.out.println("存款3000" + (c.save(3000)?"成功":"失败") + "，" + c);
    }
}
