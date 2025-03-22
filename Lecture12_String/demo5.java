package Lecture12_String;

public class demo5 {
    public static void main(String[] args) {
        String name = "Johny";

        // Acces character in string 
        System.out.println(name.charAt(0));

        // Acces All characters in string 
        for(int i=0;i<name.length() ;i++){
            System.out.print(name.charAt(i)+ "  ");
        }
    }
}
