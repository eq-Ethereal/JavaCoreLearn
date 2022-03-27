package day9.Task2;

public class Circle extends Figure {
    private double R;

    public Circle(double r,String color) {
        super(color);
        R = r;
    }

    @Override
    public double area() {
        return (3.14 * (R * R));
    }

    @Override
    public double perimeter() {
        return ((2 * R) * 3.14);
    }

}
