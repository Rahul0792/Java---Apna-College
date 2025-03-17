package Lecture2;

import java.util.Scanner;
class demo2 {
      public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        System.out.print("Enter Radius : ");
         int radius = rk.nextInt();

         double area = 3.14 * radius * radius ;
        System.out.println("Area Of Circle = " + area);
    }
}