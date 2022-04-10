package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("car0");
        cars.add("car1");
        cars.add("car2");
        cars.add("car3");
        cars.add("car4");
        System.out.println(cars);
        cars.add(2,"newCarMo***");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
    }
}
