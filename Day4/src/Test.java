public class Test {
    //3.2
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input a year of a date pls: ");
//
//        int year = input.nextInt();
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println(year + " is a leap year(366 days)");
//        }else{
//            System.out.println(year + " is not a leap year(365 days)");
//        }
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input the score: ");
//
//        int score = input.nextInt();
//
//        if (score > 100 || score < 0) {
//            System.out.println("invalid score");
//        }else if(score == 100){
//            System.out.println("BMW");
//        } else if (score >= 80) {
//            System.out.println("alien laptop");
//        } else if (score >= 60) {
//            System.out.println("new phone");
//        } else{
//            System.out.println("keep trying");
//        }
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        int rand = (int)(Math.random()*90 + 10);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("input a double-digit lottery number: ");
//
//        int number = input.nextInt();
//
//        int numUnit = number % 10;
//        int numTens = number / 10 ;
//        int randUnit = number % 10;
//        int randTens = number / 10 ;
//
//        if (number == rand){
//            System.out.println("award $10000");
//        } else if (numUnit == randTens && numTens == randUnit ){
//            System.out.println("award $ 3000");
//        } else if (numUnit == numTens && numUnit == randUnit ) {
//            System.out.println("award $ 1000");
//        } else if (numUnit == randTens || numTens == randUnit) {
//            System.out.println("award $ 500");
//        } else{
//            System.out.println("no award");
//        }
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("input 1st number pls:");
//        int num1 = input.nextInt();
//
//        System.out.println("input 2nd number pls:");
//        int num2 = input.nextInt();
//
//        System.out.println("input 3rd number pls:");
//        int num3 = input.nextInt();
//
//        if(num1 > num2){
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//
//        if(num2 > num3){
//            int temp = num2;
//            num2 = num3;
//            num3 = temp;
//        }
//
//        if(num1 > num2){
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//
//        System.out.println(num1 + " " + num2 + " " + num3);
//
//        input.close();
//    }


    //3.3
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input a year pls: ");
//
//        int year = input.nextInt();
//
//        String result = switch (year % 12) {
//            case 0 -> "monkey";
//            case 1 -> "rooster";
//            case 2 -> "dog";
//            case 3 -> "pig";
//            case 4 -> "rat";
//            case 5 -> "ox";
//            case 6 -> "tiger";
//            case 7 -> "rabbit";
//            case 8 -> "dragon";
//            case 9 -> "snake";
//            case 10 -> "horse";
//            case 11 -> "sheep";
//            default -> "unknown";
//        };
//
//        System.out.print(result);
//
//        input.close();
//    }

//    public static void main(String[] args) {
//        int a = (int) (Math.random()*6 + 1);
//        int b = (int) (Math.random()*6 + 1);
//        int c = (int) (Math.random()*6 + 1);
//
//        //System.out.println("a, b, c = " + a + ", " + b + ", " + c);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("take a guess: ");
//        String guess = input.next();
//
//        boolean result = switch(guess){
//            case ("leopard") -> a == b && b == c;
//            case ("larger than") -> a + b + c > 9;
//            case ("smaller than") -> a + b + c <= 9;
//            default -> false;
//        };
//
//        input.close();
//
//        System.out.println("result = " + result);
//    }
}
