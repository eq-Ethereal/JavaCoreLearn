package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        int sumReslult = 0;
        int sumIdx = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > sumReslult) {
                sumReslult = sum;
                sumIdx = i;
            }
        }
        System.out.println("\n" + sumReslult);
        System.out.println(sumIdx);
    }
}
