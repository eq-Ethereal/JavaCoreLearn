package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 12;
        int m = 8;
        int[][] array = new int[n][m];
        int indexOfHighterString = 0;
        int stringSum = 0;
        int stringSumResult = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = r.nextInt(50) + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            stringSum = 0;
            for (int j = 0; j < m; j++) {
                System.out.print(" " + array[i][j] + " ");
                stringSum += array[i][j];
            }
            System.out.println("    String sum: " + stringSum + " String index: " + i);
        }
        for (int i = 0; i < n; i++) {
            stringSum = 0;
            for (int j = 0; j < m; j++) {
                stringSum += array[i][j];
                if (stringSumResult <= stringSum) {
                    stringSumResult = stringSum;
                    indexOfHighterString = i;
                }
            }
        }
        System.out.println("Number of string with highter sum: " + indexOfHighterString);
    }
}
