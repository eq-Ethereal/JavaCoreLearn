package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int highterResult = 0, lowerResult = 0, SumResultWithZeroEnd = 0, CountElementsWithEndWithZero = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10001);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        lowerResult += array[0];
        for (int i : array) {
            if (i > highterResult) highterResult = i;
            if (i < lowerResult) lowerResult = i;
            if (i % 10 == 0) CountElementsWithEndWithZero++;
            if (i % 10 == 0) SumResultWithZeroEnd += i;
        }
        System.out.println("\nнаибольший элемент массива: " + highterResult +
                "\nнаименьший элемент массива: " + lowerResult +
                "\nколичество элементов массива, оканчивающихся на 0: " + CountElementsWithEndWithZero +
                "\nсумму элементов массива, оканчивающихся на 0: " + SumResultWithZeroEnd);
    }
}
