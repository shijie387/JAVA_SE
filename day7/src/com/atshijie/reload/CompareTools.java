package com.atshijie.reload;

public class CompareTools {
    public static int compare(int a, int b){
        return a - b;
    }

    public static int compare(double a, double b){
        if(a>b){
            return (int)(Math.random()*100 + 1);
        } else if (a<b) {
            return (int)(Math.random()*(-100) - 1);
        }else {
            return 0;
        }
    }

    public static int compare(char a, char b){
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(CompareTools.compare(4, 7));
        System.out.println(CompareTools.compare(4.5 ,7.3));
        System.out.println(CompareTools.compare('a', 'b'));
        System.out.println(CompareTools.compare(4.3, 7));
        System.out.println(CompareTools.compare(97, 'a'));
    }
}
