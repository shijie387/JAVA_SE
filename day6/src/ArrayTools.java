import javax.management.StandardEmitterMBean;

public class ArrayTools {

    public static void main(String[] args) {
        int[] arr = createArray(10);

        for (int i : arr) {
            System.out.print(i+",");
        }

        int arrMax = findMax(arr);
        System.out.println("arrMax = " + arrMax);

        int[] sortedArr = sortArray(arr);
        for (int i : arr) {
            System.out.print(i+",");
        }

        String arrStr = toString(arr);
        System.out.println("arrStr = " + arrStr);


    }
    public static int[] createArray(int length){
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        return arr;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
               max = array[i];
            }
        }
        return max;
    }

    public static int[] sortArray(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++){
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }



    public static String toString(int[] array){
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        return str;
    }

}
