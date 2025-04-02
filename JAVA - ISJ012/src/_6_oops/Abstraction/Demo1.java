package _6_oops.Abstraction;
public class Demo1 {
    public static void main(String[] args) {
        class A{
            void m1(){

            }
        }
        abstract class B{
            int a = 10;
            static int b = 20 ;
            abstract boolean m3();
            void m1(){
                System.out.println("Instance method m1 : B");
            }
            static void m2(){
                System.out.println("Static method m2 : B");
            }
            B(){
                System.out.println("Constructor : B");
            }
            {
                System.out.println("Instance block : B");
            }
            static{
                System.out.println("Static block : B");
            }
        }
        class C extends B{
            @Override
            boolean m3() {
                return false;
            }
        }
        B b = new C();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.m3());

        b.m1();
        b.m2();


        System.out.println(b.m3());

    }
}