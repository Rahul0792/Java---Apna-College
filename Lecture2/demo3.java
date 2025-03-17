package Lecture2;

import java.util.Scanner;
class demo3 {
    public static void main(String[] args) {
        System.out.println(" ");
                Scanner rk = new Scanner(System.in);
                System.out.print("Enter Number want to print table : ");
                int number = rk.nextInt();

                for(int i = 1;i<=10;i++){
                    System.out.println(number * i );
                }
    }
}
