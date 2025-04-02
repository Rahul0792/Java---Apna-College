package _7_Object_Class;



public class demo1 {
    public static void main(String[] args) {
        class A{

        }
        class B extends A{

        }
        B b = new B();
        int k = b.hashCode();
        System.out.println(k);  //1915910607

        A a = new A();
        int l = a.hashCode();
        System.out.println(l);  //284720968
    }
}
