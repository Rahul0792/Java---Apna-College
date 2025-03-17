package Lecture4;

import java.util.Scanner;

public class demo2 {
    
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        int num;


        do { 
            System.out.print("Enter number 0 or 1 : ");
              num = rk.nextInt();

             if(num==1){
                System.out.print("Enter Marks : ");
             int Marks = rk.nextInt();

             if(Marks >90 )
             System.out.println(" This is Good");

             else if(Marks > 80 && Marks <= 90 )
             System.out.println(" This is also  Good");

            else
             System.out.println(" This is bad");
             }

        } while (num != 0);

        System.out.println("Stop Executing ");
        
    }
}
