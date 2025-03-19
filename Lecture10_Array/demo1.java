package Lecture10_Array;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
    Scanner rk = new Scanner(System.in);

        int names[] = new int[5];
        names[0] = 10;
        names[1] = 20;
        names[2] = 30;
        names[3] = 40;
        names[4] = 50;

        for(int i=0 ;i<5 ; i++){
            System.out.println(names[i]);
        }
        System.out.println("==============================================");


        // user through
        for(int i=0 ;i<5 ; i++){
            names[i] = rk.nextInt();
        }
        System.out.println("==============================================");
        for(int i=0 ;i<5 ; i++){
            System.out.println(names[i]);
        }
    }
}
