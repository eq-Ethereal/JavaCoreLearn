package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {


    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand();
        MusicBand musicBand1 = new MusicBand();
        MusicBand musicBand2 = new MusicBand();
        MusicBand musicBand3 = new MusicBand();
        MusicBand musicBand4 = new MusicBand();
        MusicBand musicBand5 = new MusicBand();
        MusicBand musicBand6 = new MusicBand();
        MusicBand musicBand7 = new MusicBand();
        MusicBand musicBand8 = new MusicBand();
        MusicBand musicBand9 = new MusicBand();

        List<MusicBand> bands = new ArrayList<>();

        bands.add(musicBand);
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);

        Collections.shuffle(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));


    }

    public static List<MusicBand> groupsAfter2000_2(List<MusicBand> bands) {
        List<MusicBand> musicBands1 = new ArrayList<>();
        for (MusicBand band : bands) {
            if(band.getYear() >= 2000){
                musicBands1.add(band);
            }
        }
        return musicBands1;
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        bands.removeIf(musicBand -> musicBand.getYear()>=2000);
        return bands;
    }

}
