package Lecture7_Method;

public class demo1 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        int add = addition( a, b);
        System.out.println(" Addition is : " + add );
    }
     static int addition(int a,int b){
        return a + b ;
    }
}
