public class LoopPractice {
//    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i*j + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        for (int i = 1; i < 1000; i++) {
//
//            int sum = 0;
//            for (int j = 1; j < i; j++) {
//                if(i%j == 0){
//                    sum += j;
//                }
//            }
//
//            if (sum == i){
//                System.out.println(i);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int row = 5;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < row - i - 1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 2*i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < row - 1; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("  ");
//            }
//            /*
//            i=0  j=0,...6  j<=6
//            i=1  j=0,   4
//            i=2  j=0,   2
//            i=3  j=0,   0
//
//             */
//            for (int j = 0; j <= 2*(row - i-2) ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }

    public static void main(String[] args) {
        int row = 5;

        // i = 1, j = 1 ~ 4, *: 5
        // i = 2, j = 1 ~ 3, *: 4, 5, 6
        // i = 3, j = 1 ~ 2, *: 3 ~ 7
        //                                j = row - i
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
