package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String info() {
        System.out.println("Etot bike ahuenny");
        return info();
    }

    public int yearDiff(int year) {
        return this.year - year;
    }
}
