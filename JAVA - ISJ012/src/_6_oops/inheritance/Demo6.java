package _6_oops.inheritance;

public class Demo6 {
    public static void main(String[] args) {
         class A{
            int a = 300;
            int b = 400;
        }
        class B extends A{
            int a = 100;
            int b = 200;

            void print(int a , int b){
                System.out.println("Class B --->  A : " + this.a + " &  B " + this.b);
                System.out.println("Class A --->  A : " + super.a + " &  B " + super.b);
                System.out.println("Method  --->  A : " + a + " &  B " + b);
            }
        }

         B b = new B();
         b.print(400,500);
    }
}
