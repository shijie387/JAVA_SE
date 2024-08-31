import java.util.Scanner;

public class for_and_while {
//    public static void main(String[] args) {

//        for(int i = 1; i <= 100; i ++){ // int i = 2; i <= 100; i += 2
//            if (i%2 == 0){
//                System.out.println(i);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int i = 1;
//        while(i <= 100){
//            //if (i % 2 == 0) System.out.println(i);
//            if (i%2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }
//    }

//    public static void main(String[] args) {
//        int i = 100;
//        int count = 0;
//        while(i < 1000){
//            int unit = i % 10;
//            int tens = i/10 % 10;
//            int hundred = i / 100;
//
//            if (i == (Math.pow(unit, 3) + Math.pow(tens, 3) + Math.pow(hundred, 3))) {
//                count ++;
//                System.out.println("i = " + i);
//            };
//
//            i++;
//        }
//        System.out.println("count = " + count);
//    }

//    public static void main(String[] args) {
//        int count = 0;
//        for(int i = 100; i < 1000; i++){
//            int unit = i % 10;
//            int tens = i/10 % 10;
//            int hundred = i / 100;
//            if (i == (Math.pow(unit, 3) + Math.pow(tens, 3) + Math.pow(hundred, 3))) {
//                count ++;
//                System.out.println("i = " + i);
//            };
//        }
//        System.out.println("count = " + count);
//    }

//    public static void main(String[] args) {
//        for(int i = 1; i <= 150; i++){
//            System.out.print(i);
//
//            if (i % 3 ==0){
//                System.out.println("\tfoo");
//            }
//
//            if (i % 5 == 0) {
//                System.out.println("\tbiz");
//            }
//
//            if (i % 7 == 0) {
//                System.out.println("\tbaz");
//            }
//
//            System.out.println();
//        }

//        int i = 1;
//        while(i <= 150){
//            System.out.print(i);
//
//            if (i % 3 ==0){
//                System.out.println("\tfoo");
//            }
//
//            if (i % 5 == 0) {
//                System.out.println("\tbiz");
//            }
//
//            if (i % 7 == 0) {
//                System.out.println("\tbaz");
//            }
//
//            i++;
//
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 0.0;
        boolean flag = true;

        while (flag) {
            System.out.println("=========ATM========");
            System.out.println("\t1. save");
            System.out.println("\t2. withdrawal");
            System.out.println("\t3. outstanding");
            System.out.println("\t4. exit");
            System.out.print("select pls：");
            int option = input.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("\t1. saving amount");
                    double amount = input.nextDouble();
                    balance += amount;
                }
                case 2 -> {
                    System.out.println("\t2. withdrawal");
                    double amount = input.nextDouble();
                    balance -= amount;
                }
                case 3 -> {
                    System.out.println("\t3. outstanding" + balance);
                }
                case 4 -> flag = false;
            }

            System.out.println("balance = " + balance);
        }

        input.close();
    }


}
