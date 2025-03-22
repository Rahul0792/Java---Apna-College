package Lecture12_String;
import java.util.Scanner;
public class demo10 {
    public static void main(String[] args) {
        // Take an array of Strings input from the user & find the cumulative (combined) Length of all those strings
       
        Scanner rk = new Scanner(System.in);

        System.out.print("Enter Size :  ");
        int size = rk.nextInt();

        String names[] = new String [size];
        int totalLength = 0;

        for(int i=0;i<size;i++){
             names[i] = rk.next(); 
             totalLength = totalLength + names[i].length();
        }
        System.out.println("============================");

        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }
        System.out.println(totalLength);
    }
}
