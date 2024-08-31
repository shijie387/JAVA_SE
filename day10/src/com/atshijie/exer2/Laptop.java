package com.atshijie.exer2;

public class Laptop extends ElectronicDevice{
    public Laptop() {
    }

    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void connectToInternet(){
        System.out.println("connecting to the Internet");
    }
}
