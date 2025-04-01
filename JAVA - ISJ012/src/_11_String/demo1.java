package _11_String;

import java.util.Locale;

public class demo1 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println(str1 == str2); //  True
        System.out.println(str1 == str3); //  False
        System.out.println(str1 == str4); //  False
        System.out.println(str2 == str3); //  False
        System.out.println(str2 == str4); //  False
        System.out.println(str3 == str4); //  True

        str1.toLowerCase();
        str2.toUpperCase();
        System.out.println(str1);
        System.out.println(str2);
    }
}
