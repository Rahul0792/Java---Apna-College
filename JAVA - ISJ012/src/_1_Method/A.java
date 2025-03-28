package _1_Method;

public class A {
    public static void main(String[] args) {
        System.out.println("static :: A");
        B b = new B();
        b.m4();
        B.m3();

        A a = new A();
        a.m1();

    }
    public void m1(){
        System.out.println("Instance :: A");
        this.m5();

        B b = new B();
        b.m4();
        B.m3();
    }
    public void m5(){
        System.out.println("Instance :: m5");

        B b = new B();
        b.m4();
        B.m3();
    }
}
