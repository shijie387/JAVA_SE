public class HW1 {
//    public static void main(String[] args) {
//        int week = 2;
//        week += 100;
//        week %= 7;
//        System.out.println(week == 0 ? "Sunday" : week);
//    }

//    public static void main(String[] args) {
//        int a = 3;
//        int b = 1;
//
//        System.out.println((a=b) ? "Equal" : "Not Equal");
//    }

//    public static void main(String[] args) {
//        int i = 1;
//        i *= 0.2;
//        i++;
//        System.out.println("i=" + i); //1
//    }

//    public static void main(String[] args) {
//        int i = 2;
//        i *= i++;
//
//        int j = 2;
//        j *= j+1;
//
//        int k = 2;
//        k *= ++k;
//
//        System.out.println("i=" + i); // 4
//        System.out.println("j=" + j); // 6
//        System.out.println("k=" + k); // 6
//    }
//
//    public static void main(String[] args) {
//        int a = 8, b = 3;
//        System.out.println(a>>>b);//1
//        System.out.println(a>>>b | 2);//3
//    }

    //6
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//    }

//    public static void main(String[] args) {
//        int a = 5;
//        System.out.print((a & 1) == 1? "odd" : "even");
//    }
//
//    public class Homework8 {
//        public static void main(String[] args) {
//            System.out.println(3<<4);
//        }
//    }

    //9
    public static void main(String[] args) {
        int n = 8;
        System.out.println(n << (n&1));

        n = 9;
        System.out.println(n << (n&1));
    }
}


