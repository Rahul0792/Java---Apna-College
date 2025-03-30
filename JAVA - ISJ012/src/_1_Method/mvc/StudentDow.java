package _1_Method.mvc;

public class StudentDow {
    StudentService studentService = new StudentService();
    public void addStudent(Student student){
        studentService.addStudent(student);
    }
}
