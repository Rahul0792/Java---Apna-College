package Lecture3_If_else_switch;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Which Operation do you want : ");
        System.out.println("1 : Addition ");
        System.out.println("2 : Substraction ");
        System.out.println("3 : Multiplication ");
        System.out.println("4 : Division ");
        System.out.println("5 : Module ");

        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();
        int reasult = 0;

        switch(choice){
          case 1:
          reasult = num1 + num2;
          break;

          case 2:
          reasult = num1 - num2;
          break;

          case 3:
          reasult = num1 * num2;
          break;

          case 4:
          reasult = num1 / num2;
          break;

          case 5:
          reasult = num1 % num2;
          break;

          default:
          System.out.println("Enter Proper Choice ");
        }
        System.out.println("Reasult = " + reasult );
    }
}
