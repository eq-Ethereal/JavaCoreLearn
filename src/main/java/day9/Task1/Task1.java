package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Тупой Студент", "Сраная группа");
        Teacher teacher = new Teacher("Типо Умный Препод", "Но учит какой то херне");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getObjectName());
        student.printInfo();
        teacher.printInfo();

        Student student1 = new Student("Тупой Студент", "Сраная группа");
        System.out.println(student.equals(student1));
        System.out.println(student.getName().equals(student1.getName()));
        student = student1;
        System.out.println(student.equals(student1));
        System.out.println(student==student1);
    }
}
