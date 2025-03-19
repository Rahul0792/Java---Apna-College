package Lecture9_Practice_Questions;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);

        int radius = rk.nextInt();
        double CofCircle = CircuferenceOfCircle( radius );
        System.out.println("Circumference is : " + CofCircle);

    }
    public static double CircuferenceOfCircle(int radius ){
        return (2 * 3.14 * radius );
    }
}
