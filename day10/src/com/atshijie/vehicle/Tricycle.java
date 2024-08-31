package com.atshijie.vehicle;

public class Tricycle extends Vehicle{
    public Tricycle(int wheels) {
        super(wheels);
    }
    public void drive(){
        System.out.println("脚踏三轮车，稳稳当当往前走");
    }
}
