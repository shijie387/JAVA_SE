public class UnitConverter {

    public static double celsiusToFahrenheit(double celsius){
        return celsius*1.8 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32)/1.8;
    }

    public static double metersToFeet(double meters){
        return meters*3.2808;
    }
}
