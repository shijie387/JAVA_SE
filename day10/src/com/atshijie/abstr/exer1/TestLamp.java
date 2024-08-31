package com.atshijie.abstr.exer1;

public class TestLamp {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.on();
        lamp.off();

        TurnSignal t = new TurnSignal();
        t.on();
        t.off();
    }
}
