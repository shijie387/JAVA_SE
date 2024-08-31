package com.atshijie.vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        MotoCycle m = new MotoCycle(2);
        Bicycle b = new Bicycle(2);
        Tricycle r = new Tricycle(3);

        System.out.println(m.toString());
        System.out.println(b.toString());
        System.out.println(r.toString());

        m.drive();
        b.drive();
        r.drive();
    }
}
