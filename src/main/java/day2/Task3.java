package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = firstNumber;
        if (firstNumber >= secondNumber) {
            System.out.println("Некорректный ввод");
        } else {
            while (result < secondNumber) {
                if ((result % 10) == 0) {
                } else if (result % 5 == 0) {
                    System.out.print(result + " ");
                }
                result += 1;
            }
        }

    }
}
