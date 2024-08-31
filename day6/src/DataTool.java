import java.util.Scanner;

public class DataTool {

    public static boolean isLeapYear(int year){
        return (year%400 == 0 || year%4 == 0 && year%100 != 0);
    }

    public static int totalDayOfY(int year){
        return isLeapYear(year)? 366:365;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a year:");
        int year = input.nextInt();

        boolean isLeap = isLeapYear(year);
        int days = totalDayOfY(year);

        System.out.println("isLeap = " + isLeap);
        System.out.println("days = " + days);

        input.close();
    }
}
