import java.util.Scanner;

public class UnitConverterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input the celsius:");
        double ci = input.nextDouble();
        double f =  UnitConverter.celsiusToFahrenheit(ci);

        System.out.println("input the Fahrenheit:");
        double fi = input.nextDouble();
        double c =  UnitConverter.celsiusToFahrenheit(fi);

        System.out.println("input the meters:");
        double mi = input.nextDouble();
        double inch =  UnitConverter.celsiusToFahrenheit(mi);


        System.out.println("f = " + f);
        System.out.println("c = " + c);
        System.out.println("inch = " + inch);
        input.close();
    }
}
