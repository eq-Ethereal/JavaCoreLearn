package day12.task4;

import java.util.List;
import java.util.Random;

public class MusicBand {
    private String eshoName;
    private int name;
    private int year;
    private static int count = 0;
    List<String> members;

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    Random r = new Random();

    public MusicBand() {
        this.name = count++;
        this.year = r.nextInt(10)+1995;
    }

    public MusicBand(String eshoName, int year) {
        this.eshoName = eshoName;
        this.year = year;
    }
    public MusicBand(String eshoName, int year,List<String> members) {
        this.eshoName = eshoName;
        this.year = year;
        this.members = members;
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
    public static void transferMembers(MusicBand musicBand, MusicBand musicBand1){
        musicBand1.members.addAll(musicBand.members);
        musicBand.members.removeAll(musicBand.members);
    }
    public void printMembers() {
        System.out.println(members);
    }
}
