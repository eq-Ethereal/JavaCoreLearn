package day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("src/main/resources/shoes.csv");
        File fileOut = new File("src/main/resources/missing_shoes.txt");
        whatIsMissing(fileIn, fileOut);
    }

    public static void whatIsMissing(File fileIn, File fileOut) {
        try {
            Scanner scanner = new Scanner(fileIn);
            PrintWriter print = new PrintWriter(fileOut);
            while (scanner.hasNextLine()) {
                String item = scanner.nextLine();
                String[] itemSplit = item.split(";");
                if (Integer.parseInt(itemSplit[2]) == 0) {
                    System.out.println(item);
                    print.println(item);
                }
            }
            scanner.close();
            print.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл " + e);
        }
    }
}
