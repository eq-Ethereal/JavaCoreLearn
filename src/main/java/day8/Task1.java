package day8;

public class Task1 {
    public static void main(String[] args) {
        String numb = "";
        long timeFirst = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numb += i + " ";
        }
        //System.out.println(numb);
        long timeSecond = System.currentTimeMillis();
        System.out.println("!!!!!!!!!!!!!!!!! Время выполнения: " + (timeSecond - timeFirst));
        timeFirst = System.currentTimeMillis();
        StringBuilder sbnumb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sbnumb.append(i).append(" ");
        }
        //System.out.println(sbnumb);
        timeSecond = System.currentTimeMillis();
        System.out.println("!!!!!!!!!!!!!!!! Время выполнения: " + (timeSecond - timeFirst));
    }
}
