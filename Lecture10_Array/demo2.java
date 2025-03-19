package Lecture10_Array;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
         Scanner rk = new Scanner(System.in);

        String names[] = new String[5];
        names[0] = "RK";
        names[1] = "PK";
        names[2] = "NR";
        names[3] = "MW";
        names[4] = "PG";

        for(int i=0 ;i<5 ; i++){
            System.out.println(names[i]);
        }
        System.out.println("==============================================");


        // user through
        for(int i=0 ;i<5 ; i++){
            names[i] = rk.nextLine();
        }

        System.out.println("==============================================");
        for(int i=0 ;i<5 ; i++){
            System.out.println(names[i]);
        }
    }
}
