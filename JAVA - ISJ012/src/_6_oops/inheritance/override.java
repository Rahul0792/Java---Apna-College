package _6_oops.inheritance;

public class override {
    public static void main(String[] args) {
        class  Student{

            public void m1(String msg){
                System.out.println("Hello Students "+msg);
            }
        }
        class Teacher extends  Student{

            @Override
            public void m1(String msg){
                System.out.println("Hello Teachers "+msg);
            }
        }
        Teacher teacher = new Teacher();
           teacher.m1("Good Morning ");
    }
}
