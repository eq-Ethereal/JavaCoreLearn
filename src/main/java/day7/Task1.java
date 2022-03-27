package day7;

public class Task1 {
    public static void main(String[] args) {
       Airplane airplane = new Airplane("IAMProducerMotherfucker",2020,15.5, 84234.3);
       Airplane airplane1 = new Airplane("ho-ho-ho", 2019, 5000,9999);
       Airplane.compareAirplanes(airplane,airplane1);
    }
}
