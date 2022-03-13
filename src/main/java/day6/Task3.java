package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("TeacherName", "subjectName");
        Student student = new Student("lox");
        teacher.evaluate(student);

    }
}
