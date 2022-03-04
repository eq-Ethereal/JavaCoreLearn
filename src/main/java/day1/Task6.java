package day1;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int k = r.nextInt(11);
        for (int i = 0; i < 10; i++) {
            System.out.println(k * i);
        }
    }
}
