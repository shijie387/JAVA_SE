import java.util.Arrays;
import java.util.Scanner;

public class ArrayAlgorithm {
//    public static void main(String[] args) {
//        int[] nums = new int[5];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] =(int) (Math.random()*100);
//            System.out.println(nums[i]);
//        }
//
//        int count5 = 0;
//        int count3 = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 3 == 0){
//                count3 ++;
//            }
//            if(nums[i] % 5 == 0){
//                count5++;
//            }
//        }
//
//        System.out.println("count3 = " + count3);
//        System.out.println("count5 = " + count5);
//    }


//    public static void main(String[] args) {
//        int[] nums = new int[5];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] =(int) (Math.random()*100);
//            System.out.println(nums[i]);
//        }
//
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//
//        int avg = sum/ nums.length;
//
//        System.out.println("sum = " + sum);
//        System.out.println("avg = " + avg);
//    }

//    public static void main(String[] args) {
//        int[] nums = new int[5];
//
//        int max = nums[0]; //default:0
//        int min = nums[0]; //default:0
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int)(Math.random()*100);
//
//            if (i == 0){
//                max = nums[i];
//                min = nums[i];
//            } else if(max < nums[i]){
//               max = nums[i];
//           } else if (min > nums[i]) {
//               min = nums[i];
//           }
//
//            System.out.print(nums[i]);
//
//        }
//
//
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//    }

//    public static void main(String[] args) {
//        int[] nums = {3,5,11,54};
//
//        int indexOfMax = nums[0];
//        for (int i = 0;  i < nums.length; i++) {
//            if (nums[indexOfMax] < nums[i]){
//                indexOfMax = i;
//            }
//        }
//
//        System.out.println(nums[indexOfMax]);
//        System.out.println(indexOfMax);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2,43,52,7,8,9,52};
//
//        int max = 0;
//        String index = " ";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//                index = " " + i;
//            } else if (arr[i] == max) {
//                index += "," + i;
//            }
//        }
//
//        System.out.println("index = " + index);
//    }

//    public static void main(String[] args) {
//        int[] arr = {2,43,52,7,8,9,52};


//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        for(int left = 0, right = arr.length - 1; left < right; left ++, right --){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {
//        int[] arr = {2,43,52,7,8,9,52};
        
//        int index = -1;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("input a num pls: ");
//        int target = input.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (index != -1){
//                System.out.println("find it");
//                index = i;
//                break;
//            }
//
//        }
//        if(index == -1 ){
//            System.out.println("didn't find");
//        }
//
//        System.out.println("index = " + index);
//
//        input.close();
        int[] arr = {1,2,3,5,7,8,11};
        int target = 10;

        for (int i = 0; i < arr.length; i++) {


                if (target == arr[i]) {
                    System.out.println("find it");
                    break;
                }

                if(target > arr[i]){
                    System.out.println("didnt find");
                }


        }


    }
}
