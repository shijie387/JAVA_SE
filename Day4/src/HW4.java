import java.util.Scanner;

public class HW4 {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 100; i+=2) {
//            if(i % 10 != 0){
//                System.out.print(i +",");
//            }else {
//                System.out.println(i);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        double mtQo = 8848.86 * Math.pow(10,3);
//        double thicknessOfPaper = 0.1;
//
//        int count = 0;
//
//        while (mtQo > thicknessOfPaper) {
//            thicknessOfPaper *= 2;
//            count ++;
//        }
//
//        System.out.println("count = " + count);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(" input year pls: ");
//        int year = input.nextInt();
//        System.out.println("input month pls:");
//        int month = input.nextInt();
//        System.out.println("input day pls:");
//        int day = input.nextInt();
//
//        int days = day;
//        for (int i = 1; i < month; i++) {
//            if (i == 4 || i == 6 || i == 9 || i == 11) {
//                days += 30;
//            } else if (i == 2) {
//                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                    days += 29;
//                } else {
//                    days += 28;
//                }
//            } else {
//                days += 31;
//            }
//        }
//        System.out.println("days = " + days);
//        input.close();
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;

        while(true) {
            System.out.print("Enter integers: ");
            int number = input.nextInt();

            if (number < 0) {
                negativeNum++;
            } else if (number > 0) {
                positiveNum++;
            } else {
                break;
            }
        }

        System.out.println("positiveNum = " + positiveNum);
        System.out.println("negativeNum = " + negativeNum);
    }
}
