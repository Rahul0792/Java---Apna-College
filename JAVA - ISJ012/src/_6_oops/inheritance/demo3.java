package _6_oops.inheritance;

public class demo3 {
    public static void main(String[] args) {
        class A{
            A(){
                System.out.println("A class constructor");
            }
            {
                System.out.println("A class Instance block");
            }
            static {
                System.out.println("A class static block");
            }
        }
        class B extends A{
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

        B b = new B();

    }

}


