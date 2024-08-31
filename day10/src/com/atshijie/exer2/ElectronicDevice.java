package com.atshijie.exer2;
//（1）设计一个`ElectronicDevice`类，
//
//        - 具有`brand`（品牌）和`model`（型号）属性，私有化
//        - 构造器、get/set方法
//        - 声明`powerOn()`（开机）和`powerOff()`（关机）方法
//        - 重写`toString()`方法：返回电子设备详细信息
public class ElectronicDevice {
    private String brand;
    private String model;

    public ElectronicDevice() {
    }
    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void powerOn(){
        System.out.println("powering on...");
    }

    public void powerOff(){
        System.out.println("powering off...");
    }
}
