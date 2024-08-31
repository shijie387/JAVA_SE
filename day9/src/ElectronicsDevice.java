public class ElectronicsDevice {
//    （1）创建一个`ElectronicsDevice`类，
//
//            - 具有以下私有属性：
//
//            - `brand`（品牌）
//
//            - `model`（型号）
//
//            - `powerStatus`（电源状态，是否开启状态）
//
//            - `batteryLevel`（电池电量）
//
//            - 提供有参构造。创建对象时默认`powerStatus`状态值为false，`batteryLevel`电池电量值为100。
//            - 提供上述属性的get方法。
//            - 实现方法来打开`turnOn`和关闭`turnOn`设备，以及充电`charge`和放电`discharge`功能。
//            - 打开和关闭方法会判断并修改`powerStatus`的电源状态值。充电和放电方法会判断和修改`batteryLevel`电池电量的值，并且需要确保电池电量在合理的范围内变动。
    private String brand;
    private String model;
    private static boolean powerStatus = false;
    private static int batteryLevel = 100;

    public void turnOn(){
        if (!powerStatus){
            powerStatus=true;
            System.out.println("the power is on");
        }else {
            System.out.println("the power has already off");
        }
    }
    public void turnOff(){
        if (powerStatus){
            powerStatus=false;
            System.out.println("the power is off");
        }else {
            System.out.println("the power has already on");
        }
    }

    public void charge(int percentage){
        if (batteryLevel>100 || batteryLevel< 0){
            System.out.println("invalid");
        }else if (batteryLevel==100){
            System.out.println("the battery doesn't need to be charged");
        }else {
            batteryLevel += percentage;
            System.out.println(batteryLevel +" after being charged");
        }
    }
    public void discharge(int percentage){
        if (batteryLevel>=0 && batteryLevel<=100){
            batteryLevel = Math.min(batteryLevel+percentage, 100);
            System.out.println(batteryLevel +" after being charged");
        }else {
            System.out.println("invalid");
        }
    }
    public ElectronicsDevice() {
    }

    public ElectronicsDevice(String brand, String model) {
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

    public static boolean isPowerStatus() {
        return powerStatus;
    }

    public static void setPowerStatus(boolean powerStatus) {
        ElectronicsDevice.powerStatus = powerStatus;
    }

    public static int getBatteryLevel() {
        return batteryLevel;
    }

    public static void setBatteryLevel(int batteryLevel) {
        ElectronicsDevice.batteryLevel = batteryLevel;
    }
}
