package com.atshijie.tools;

public class StringConcat {
    public static String concatWith(String separator,String... strings){
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str += i == 0? "": separator;
            str+= strings[i];
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(concatWith("-","hello","world","java"));
    }
}
