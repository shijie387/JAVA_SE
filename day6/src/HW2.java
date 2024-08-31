import java.util.Scanner;

public class HW2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("the number of students:");
//        int count = input.nextInt();
//
//        String[] names = new String[count];
//        int[] scores = new int[count];
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("input name pls:");
//            names[i] = input.next();
//        }
//
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("input scores pls:");
//            scores[i] = input.nextInt();
//        }
//
//        input.close();
//        System.out.println("names and scores as below");
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(names[i] + ":" + scores[i]);
//        }
//
//        boolean flag = false;
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] == 100){
//                System.out.println("100:" + names[i]);
//                flag = true;
//            }
//        }
//        if (!flag){
//            System.out.println("0 student with 100");
//        }
//
//        int maxScore = scores[0];
//        for (int i = 0; i < scores.length; i++) {
//            if (maxScore<scores[i]){
//                maxScore = scores[i];
//            }
//        }
//        System.out.println("maxScore = " + maxScore);
//
//        for (int i = 0; i < names.length; i++) {
//            if (maxScore== scores[i]){
//                System.out.println(names[i]);
//            }
//        }
//    }


//    public static void main(String[] args) {
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) ((Math.random()*50 + 1)* 2);
//        }
//
//        for (int i = 0; i < arr.length-1; i++) { //row
//            for (int j = 1; j < arr.length - i; j++) {
//                if(arr[j] < arr[j - 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a word pls:");
        String word = input.next();

        char[] wordCharArr =word.toCharArray();

        boolean flag = true;
        for(int l = 0, r = wordCharArr.length-1; l<r; l++,r--){
            if (wordCharArr[l] != wordCharArr[r]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("yes");
        }else {
            System.out.println("false");
        }
    }
}
