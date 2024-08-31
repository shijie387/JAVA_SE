public class TestElectronicDevices {
    public static void main(String[] args) {
        ElectronicsDevice d = new ElectronicsDevice("gg", "hkj");
        System.out.println(d.getBrand());
        d.turnOn();
        d.turnOff();
        d.charge(11);
    }
}
