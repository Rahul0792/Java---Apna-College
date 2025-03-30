package _1_Method.mvc;

public class app {

    public static void main(String[] args) {
        Student student = new Student();
        student.id =10000;
        student.name = "Rahul";
        student.Address = "Bharadi";
        StudentController studentController = new StudentController();
        studentController.addStudent(student);
    }
}
