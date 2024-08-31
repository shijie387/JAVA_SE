import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input integers a: ");
        int a = input.nextInt();
        System.out.println("input integers b: ");
        int b = input.nextInt();

        System.out.println("sum = " + Calculator.add(a,b));
        System.out.println("difference = " + Calculator.subtract(a,b));
        System.out.println("product = " + Calculator.multiple(a,b));
        System.out.println("quotient = " + Calculator.divide(a,b));
        System.out.println("reminder = " + Calculator.reminder(a,b));

        input.close();
    }
}
