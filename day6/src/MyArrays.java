public class MyArrays {
    public static int sum(int[] arr){
        int sum = 0;
        for (int i : arr) {
           sum += i;
        }
        return sum;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min<arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int indexOf(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] arr, int value){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (value==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int valueCount(int[] arr, int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j]>arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){break;}
        }
    }

    public static void reverse(int[] arr, int start, int end){
        for (int left = start, right = end; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr = new int[newLength];

        for (int i = 0; i < arr.length && i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static String toString(int[] arr){
        String str ="[";

        for (int i = 0; i < arr.length; i++) {
            str += i == 0 ? "" : ",";
            str+= arr[i];
        }
        str+="]";
        return str;
    }
}
