public class TemperatureSensor {
//            - 私有属性`temperature`（温度）。
//            - 静态常量`LOW_THRESHOLD`：表示预设的最低临界温度阈值，初始化为0.0。
//            - 静态常量`HIGH_THRESHOLD`：表示预设的最高临界温度阈值，初始化为100.0。
//            - 提供无参和有参构造，便于创建对象。
//            - 提供一个方法`updateTemperature(double temp)`来更新温度读数，并且有一个`getTemperature()`方法返回当前温度。
//            - 提供最低和最高临界温度阈值的get方法。
//            - 此外，实现一个`isCritical()`方法，如果温度超过预设阈值则返回`true`。
    private double temperature;
    private static double LOW_THRESHOLD = 0.0;
    private static double HIGH_THRESHOLD = 100.0;

    public TemperatureSensor() {
    }

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

   public void updateTemperature(double temp){
        this.temperature = temp;
   }
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static double getLowThreshold() {
        return LOW_THRESHOLD;
    }

    public static void setLowThreshold(double lowThreshold) {
        LOW_THRESHOLD = lowThreshold;
    }

    public static double getHighThreshold() {
        return HIGH_THRESHOLD;
    }

    public static void setHighThreshold(double highThreshold) {
        HIGH_THRESHOLD = highThreshold;
    }

    public boolean isCritical() {
        return this.temperature > HIGH_THRESHOLD || this.temperature < LOW_THRESHOLD;
    }
}
