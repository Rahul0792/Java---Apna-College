package _1_Method.Classes;

public class demo1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(1);
        student.setName("Rahul");

        System.out.println("Name is : " + student.getName());
        System.out.println("id is : "+ student.getId());
    }
}
