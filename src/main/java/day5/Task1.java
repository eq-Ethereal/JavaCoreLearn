package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2021,"GreenYellowBlue","ShiityModel");
        System.out.println(car.getYear()+ " " + car.getColor() + " " + car.getModel());
        car.setColor("OhuennyCvetChoTi");
        car.setModel("ZaebisMashinaDesyatLetGonayu");
        car.setYear(2084);
        System.out.println(car.getYear()+ " " + car.getColor() + " " + car.getModel());
    }
}
