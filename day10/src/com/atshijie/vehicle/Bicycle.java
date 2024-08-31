package com.atshijie.vehicle;

public class Bicycle extends Vehicle {
    public Bicycle(int wheels) {
        super(wheels);
    }
    public void drive(){
        System.out.println("脚踏双轮自行车，优哉游哉往前走");
    }
}
