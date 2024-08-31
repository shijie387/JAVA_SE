package com.atshijie.exer2;
//（2）创建子类`Smartphone`（手机）、`Laptop`（笔记本电脑）和`Television`（电视机），每个子类添加特定于设备的功能，如
//
//        - `sendSMS()`（发短信）对于`Smartphone`
//        - `connectToInternet()`（连网）对于`Laptop`
//        - `changeChannel()`（切换频道）对于`Television`
//
//        每个子类继续重写`toString()`方法，并在子类中明确当前电子设备的具体类型，例如：`Smartphone`子类的`toString()`方法中体现“手机”等
public class SmartPhone extends ElectronicDevice{
    public SmartPhone() {
    }

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void sendSMS(){
        System.out.println("sending msg");
    }
}
