package _1_Method.Classes;

public class B {
    public static void m3() {
        System.out.println("Static :: B");
        A a = new A();
        a.m1();

    }
    void m4(){
        System.out.println("Instance :: B");
        A a = new A();
        a.m1();
    }
}
