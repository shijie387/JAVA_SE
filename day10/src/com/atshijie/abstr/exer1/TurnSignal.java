package com.atshijie.abstr.exer1;

public class TurnSignal extends Light{
    @Override
    public void off() {
        System.out.println("the signal light is off");
    }

    @Override
    public void on(){
        System.out.println("the signal light is on");
    }
}
