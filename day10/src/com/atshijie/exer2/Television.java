package com.atshijie.exer2;

public class Television extends ElectronicDevice {
    public Television() {
    }

    public Television(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return "Television{} " + super.toString();
    }

    public void changeChannel(){
        System.out.println("changing channel");
    }
}