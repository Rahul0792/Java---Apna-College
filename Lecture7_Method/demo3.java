package Lecture7_Method;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        int num = rk.nextInt();
        int i = 1;
        int fact=1;
        while(i<=num){
             fact = fact * i;
             i++;
        }

        System.out.println("Factorial = : "+ fact);
    }
    
}