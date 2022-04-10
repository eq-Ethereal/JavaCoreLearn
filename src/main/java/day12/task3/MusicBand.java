package day12.task3;

import java.util.Random;

public class MusicBand {
    private String eshoName;
    private int name;
    private int year;
    private static int count = 0;
    Random r = new Random();

    public MusicBand() {
        this.name = count++;
        this.year = r.nextInt(10)+1995;
    }

    public MusicBand(String eshoName, int year) {
        this.eshoName = eshoName;
        this.year = year;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name=" + name +
                ", year=" + year;
    }
}
