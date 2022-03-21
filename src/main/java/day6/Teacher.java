package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int grade = gradeCalculate();
        String gradeEv = "";
        if (grade == 5) gradeEv = "отлично";
        else if (grade == 4) gradeEv = "хорошо";
        else if (grade == 3) gradeEv = "удовлетворительно";
        else if (grade == 2) gradeEv = "неудовлетворительно";
        else gradeEv = "ChtoTiTakoe";
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + gradeEv);
    }

    private int gradeCalculate() {
        Random r = new Random();
        return r.nextInt(4) + 2;
    }
}
