package Lecture9_Practice_Questions;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);

        int num1 = rk.nextInt();
        int num2 = rk.nextInt();
        int num3 = rk.nextInt();

        int avg =  average(num1,num2,num3);
        System.out.println("average " + avg );

    }
    public static int average(int num1,int num2,int num3){
        return ( num1 + num2+num3 ) / 3 ;
    }
}

