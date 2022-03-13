package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("IAMProducerMotherfucker",2020,15.5, 84234.3);
        airplane.info();
        airplane.setYear(2021);
        airplane.setLength(250.30);
        airplane.fillUp(10);
        airplane.info();
        airplane.fillUp(25);
        airplane.info();
    }
}
