package Lecture12_String;

public class demo6 {
    public static void main(String[] args) {
        // Compare Two Strings

        String name1 = "Johny";
        String name2 = "Johny";

        if(name1.equals(name2)){
            System.out.println("String Are Same : ");
        }else{
            System.out.println("String Are Not Same ");
        }

        if(new String("Tony") == new String("Tony")) { 
            System.out.println("They are the same string"); 
        } else { 
            System.out.println("They are different strings"); 
        }

        if(name1 == name2) { 
            System.out.println("They are the same string"); 
        } else { 
            System.out.println("They are different strings"); 
        }
    }
}
