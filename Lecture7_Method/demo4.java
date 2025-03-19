package Lecture7_Method;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        // int num = rk.nextInt();
        int num = 8;
        int flag = 1 ;

        for(int i = 2 ; i<num ; i++){
            if(num % i == 0 ){
                flag = 0 ;
                break;
            }
        }
        if( flag == 1  && num !=1 ){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is non prime");
        }
    }
    
}