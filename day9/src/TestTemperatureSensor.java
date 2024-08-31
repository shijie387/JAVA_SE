import javax.crypto.spec.PSource;

public class TestTemperatureSensor {
//    （2）声明一个`TestTemperatureSensor`测试类，创建`TemperatureSensor`类对象，查看当前温度以及最低和最高温度阈值，尝试更新温度，重新查看当前温度，并判断是否超过临界温度。

    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor(33);
        System.out.println(ts.getTemperature());
        ts.updateTemperature(55);
        System.out.println(ts.getTemperature());
        System.out.println(ts.getLowThreshold());
        System.out.println(ts.getHighThreshold());
        System.out.println(ts.isCritical());
    }
}
