package Lecture12_String;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        // String Original = rk.nextLine();
        String Original = "eabcdef" ;
        String duplicate = "";
        for(int i=0; i<Original.length(); i++){
            if( Original.charAt(i) == 'e'  ){
                duplicate = duplicate + "i";
            }else{
                duplicate = duplicate + Original.charAt(i) ;
            }
        }
        System.out.println(Original);
        System.out.println(duplicate);
    }
}
