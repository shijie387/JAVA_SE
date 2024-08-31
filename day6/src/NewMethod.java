public class NewMethod {
    public static int twoSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int[] getNumBetween(int a){
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    
    //call
//    public static void main(String[] args) {
//        int z = twoSum(1,3);
//        System.out.println("z = " + z);
//    }



}
