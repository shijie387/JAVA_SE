public class HW2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number: ");
//
//        int num1 = input.nextInt();
//
//        if(num1 % 5 == 0 & num1 != 0){
//            System.out.println(num1 + " is multiples of 5");
//        }else{
//            System.out.print("not multiples of 5");
//        }
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("input a character pls: ");
//
//        char input1 = input.next().charAt(0);
//        if (input1 >= 0 && input1 <= 9) {
//            System.out.print("input1 is a number ");
//        }else if (input1 >= 'a' && input1 <= 'z' || input1 >= 'A' && input1 <= 'Z') {
//            System.out.print("input1 is a element of the alphabet ");
//        }else{
//            System.out.print("input1 is not a number and also not a letter ");
//        }
//
//        input.close();
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the current price: ");
//
//        double price = input.nextDouble();
//
//        if(price < 0){
//            System.out.println("The price is negative");
//        }else {
//            double discount;
//            if(price >= 500){
//                discount = 0.8;
//            } else if (price >= 400) {
//                discount = 0.85;
//            }else if(price>=300){
//                discount = 0.9;
//            }else if(price>=200){
//                discount = 0.95;
//            }else{
//                discount = 1;
//            }
//            System.out.print("total price is: " + discount * price);
//        }
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 0;
//        boolean flag = false;
//        if (flag == true) {
//            c = a++ + b;
//        }
//
//        if (flag == false) {
//            c = ++a - b;
//        }
//        System.out.println("a = " + a); //2
//        System.out.println("b = " + b); //2
//        System.out.println("c = " + c); //0
//    }

//    = value assignment
//    == equal

//    public class Part01_Exercise03_1{
//        public static void main(String[] args){
//            int x = 1;
//            int y = 1;
//
//            if(x++==2 & ++y==2){
//                x =7;
//            }
//            System.out.println("x="+x+",y="+y); // 2 2
//        }
//    }

//    public class Part01_Exercise03_2{
//        public static void main(String[] args){
//            int x = 1,y = 1;
//
//            if(x++==2 && ++y==2){
//                x =7;
//            }
//            System.out.println("x="+x+",y="+y); // 2 1
//        }
//    }

//    public class Part01_Exercise03_3{
//        public static void main(String[] args){
//            int x = 1,y = 1;
//
//            if(x++==1 | ++y==1){
//                x =7;
//            }
//            System.out.println("x="+x+",y="+y); // 7 2
//        }
//    }

//    public class Part01_Exercise03_4{
//        public static void main(String[] args){
//            int x = 1,y = 1;
//
//            if(x++==1 || ++y==1){
//                x =7;
//            }
//            System.out.println("x="+x+",y="+y); // 7 1
//
//        }
//    }

//    public static void main(String[] args){
//        boolean x = true;
//        boolean y = false;
//        short z = 42;
//
//        if((z++==42)&&(y==true))	z++; // z 43
//        if((x=false) || (++z==45))  z++; // z
//
//        System. out.println("z="+z);
//    }

//    public static void main (String []  args)  {
//        boolean x = true;
//        boolean y = false;
//        short z = 42;
//
//        if(y=true);
//        if((z++==42)&&(y==true))	z++;
//        if((x=false) || (++z==45))  z++;
//
//        System. out.println("z="+z); //46
//    }

}
