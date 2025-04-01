package _6_oops.inheritance;

public class B extends A{
    B(){
        System.out.println("B class constructor");
    }
    {
        System.out.println("B class Instance block");
    }
    static {
        System.out.println("B class static block");
    }
}
