package Lecture11_2D_Array;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int matrix[][] = new int [2][3];

        Scanner rk = new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = rk.nextInt();
            }
        }

        System.out.println("==================================");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print (matrix[i][j] + "   " );
            }
            System.out.println();
        }
    }
}

