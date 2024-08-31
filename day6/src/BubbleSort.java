public class BubbleSort {
//    public static void main(String[] args) {
////        int[] arr = {2,4,1,3,44,62,2,1};
//        int[] arr = {2,1,3,4,5};
//
//        for (int i = 1; i < arr.length ; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < arr.length - i; j++) {
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            System.out.println(arr[i]);
//            if (!swapped){break;}
//        }
//
//        for (int i=0; i< arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    //BinarySearch
    public static void main(String[] args) {
        int[] arr = {2,6,8,12,53};
        int target = 8;

        int index = -1;
        for(int left = 0, right = arr.length-1; left < right; ){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                System.out.println(index=mid);
                break;
            }else if (arr[mid]> target){
                right = mid + 1;
            }else {
                left = mid - 1;
            }
        }
    }
}
