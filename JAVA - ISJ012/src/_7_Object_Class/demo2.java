package _7_Object_Class;

public class demo2 {
    public static void main(String[] args) {
        class A {
            void m1(){
                System.out.println("Hello ");
            }
        }
        class B extends A{
           
        }

        A ref1 = new A();
        System.out.println(ref1.getClass());  //class _7_Object_Class.demo2$1A
    }
}
