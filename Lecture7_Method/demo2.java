package Lecture7_Method;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        int a = rk.nextInt();
        int b = rk.nextInt();

        int add = Mutiplication( a, b);
        System.out.println(" Multiplication is : " + add );
    }
     static int Mutiplication(int a,int b){
        return a * b ;
    }
}
