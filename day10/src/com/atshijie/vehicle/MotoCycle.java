package com.atshijie.vehicle;

public class MotoCycle extends Vehicle {
//
//- 重写drive`方法，输出“脚踏独轮车，摇摇摆摆往前走”
//
//            （3）声明子类`com.atshijie.vehicle.Bicycle`自行车
//
//- 重写`drive`方法，输出“脚踏双轮自行车，优哉游哉往前走”
//
//            （4）声明子类`com.atshijie.vehicle.Tricycle`三轮车
//
//- 重写`drive`方法，输出“脚踏三轮车，稳稳当当往前走“

    public MotoCycle(int wheels) {
        super(wheels);
    }

    public void drive(){
        System.out.println("脚踏独轮车，摇摇摆摆往前走");
    }
}



