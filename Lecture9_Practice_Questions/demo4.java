package Lecture9_Practice_Questions;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        int age = rk.nextInt();

        if(age >=18 ){
            System.out.println("Voting Allowed");
        }else{
            System.out.println("Voting Not Allowed");
        }
    }
}
