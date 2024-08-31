import java.util.Scanner;

public class Array {


    public static void main(String[] args) {

        String [] name;
        name = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(i + ": " + name[i]);
        }

        System.out.println("----------------");

        String[] name2 = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < name2.length; i++) {
            System.out.println(i + ": " + name[i]);
        }


        String[] name3 = new String[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < name3.length; i++) {
            System.out.println("Enter a name: ");
            name3[i] = input.next();
        }
        for (int i = 0; i < name3.length; i++) {
            System.out.println(i + ": " + name3[i]);
        }

        input.close();
    }
}
