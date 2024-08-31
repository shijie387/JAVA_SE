import java.util.Scanner;

public class DoWhilePractice {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int positive = 0;
//        int negative = 0;
//
//        int a;
//        do{
//            System.out.print("Enter a integer: ");
//            a = input.nextInt();
//            if (a > 0){
//                positive++;
//            } else {
//                negative++;
//            }
//        }while(a != 0);
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int positive = 0;
//        int negative = 0;
//
//        while(true){
//            System.out.print("Enter a integer: ");
//            int a = input.nextInt();
//            if (a > 0){
//                positive++;
//            } else if (a < 0) {
//                negative++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(positive);
//        System.out.println(negative);
//    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        int a = 1;
        for (;a != 0;) {
            System.out.print("Enter a integer: ");
            a = input.nextInt();

            if (a > 0){
                positive++;
            } else if (a < 0) {
                negative++;
            } else {
                break;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
    }
}
