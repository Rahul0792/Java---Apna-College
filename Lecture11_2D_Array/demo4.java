package Lecture11_2D_Array;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);

        int array[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Transpose Matrix ");
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Another Transpose Matrix ");

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         array[j][i] = array[i][j];
        //         System.out.print(array[j][i] + "  ");

        //     }
           
        //     System.out.println("");
        // }
    }
}
