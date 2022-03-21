package day9.Task2;

public class Triangle extends Figure {
    private double a,b,c;

    public Triangle( double a, double b, double c,String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return ((a*b)/2);
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
