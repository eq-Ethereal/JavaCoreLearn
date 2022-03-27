package day9.Task1;

public class Teacher extends Human{
    private String objectName;

    public Teacher(String name, String objectName) {
        super(name);
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
