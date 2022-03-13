package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int countHighterEight = 0, countOneNumbers = 0, countEvenNumbers = 0, countOddNumber = 0, SumOfElements = 0;
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }

        System.out.println("Информация о массиве:");
        System.out.println("Массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nДлина массива: " + array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                countHighterEight++;
            }
            if (array[i] == 1) {
                countOneNumbers++;
            }
            if (array[i] % 2 == 0) {
                countEvenNumbers++;
            }
            if (array[i] % 2 == 1) {
                countOddNumber++;
            }
            SumOfElements+=array[i];
        }
        System.out.println("Количество чисел больше 8: " + countHighterEight);
        System.out.println("Количество чисел равных 1: " + countOneNumbers);
        System.out.println("Количество четных чисел: " + countEvenNumbers);
        System.out.println("Количество нечетных чисел: " + countOddNumber);
        System.out.println("Сумма всех элементов массива: " + SumOfElements);
    }
}




