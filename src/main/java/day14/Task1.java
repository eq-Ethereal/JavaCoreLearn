package day14;

import java.io.*;
import java.util.StringTokenizer;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("/Users/ethereal/IdeaProjects/JavaCoreLearn/digits");
            printSumDigits(file);
        } catch (IOException ex) {
            System.out.println("File not found");
        }

    }

    public static void printSumDigits(File file) throws IOException, IllegalArgumentException {
        int sum = 0;
        int number = 0;
        int count = 0;
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();

        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int) file.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String[] data = s.split(" ");
        for (int i = 0; i < data.length; i++) {
            count++;
        }
        if (count != 10) {
            throw new IllegalArgumentException("Некорректный входной файл: " + count);
        }

        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        while (tokenizer.hasMoreTokens()) {
            try {
                sum += Integer.parseInt(tokenizer.nextToken());
            } catch (NumberFormatException ex) {
                System.out.println("Wrong number format");
            }
        }

        System.out.println(sum);
    }
}
