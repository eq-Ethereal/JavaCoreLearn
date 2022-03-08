package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y != 0.0) {
                System.out.print(x / y + "\n");
            } else {
                flag = false;
            }
        }
    }
}