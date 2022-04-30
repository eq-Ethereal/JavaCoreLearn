package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantner");
        day12.task4.MusicBand band1 = new day12.task4.MusicBand("Jefferson Airplane", 1965, members1);

        System.out.println(band1.getMembers());

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Paul McCartney");
        day12.task4.MusicBand band2 = new day12.task4.MusicBand("The Beatles", 1960, members2);

        System.out.println(band2.getMembers());

        MusicBand.transferMembers(band1, band2);

        System.out.println("\n\n" + band1.getMembers() + " " + band2.getMembers());
    }
}
