package com.atshijie.casting2;
//5）声明一个子类`Manager`经理，继承`SalaryEmployee`
//
//        - 增加属性：奖金比例`bonusRatio`，私有化，提供get/set方法
//        - 重写`earning()`方法，返回 薪资 *(1+奖金比例)作为实发工资
//        - 重写`public String getBasicInfo()`：返回"职位：经理，" + 姓名和月薪`salary`、奖金比例`bonusRatio`
public class Manager extends SalaryEmployee{
    private double bonusRatio;

    public Manager() {
    }
    public Manager(String name, double salary, double bonusRatio) {
        super(name, salary);
        this.bonusRatio = bonusRatio;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
    public double earning(){
        return getSalary()*(1+bonusRatio);
    }
    public String getBasicInfo(){
        return "position: manager" + super.getBasicInfo() + "bonusRatio" + bonusRatio;
    }
}
