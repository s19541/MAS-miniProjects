package PrzykladyPozaProjektem;

import Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Verse {
    public int number;
    public int numberOfWords;
    private Song song;
    private static List<Verse> extent = new ArrayList<>();
    private Verse(Song song, int number, int numberOfWords) {
        this.number = number;
        this.numberOfWords = numberOfWords;
        this.song = song;
    }
    public static Verse createVerse(Song song, int number, int numberOfWords) throws Exception {
        if(song == null) {
            throw new Exception("The given song does not exist!");
        }
        Verse verse = new Verse(song, number, numberOfWords);
        song.addVerse(verse);
        extent.add(verse);
        return verse;
    }
    public static void removeVerse(Verse verse){
        extent.remove(verse);
    }
    public static void showExtent() {
        System.out.println("Extent of the class: " + Verse.class.getName());
        for (Verse verse : extent) {
            System.out.println(verse);
        }
    }
    public static void showVersesWithMinimalNumberOfWords(int minimalNumberOfWords){
        for(Verse verse : extent){
            if(verse.numberOfWords > minimalNumberOfWords)
                System.out.println(verse);
        }
    }

    @Override
    public String toString() {
        return "Verse{" +
                "number=" + number +
                ", numberOfWords=" + numberOfWords +
                ", song=" + song.title +
                '}';
    }
}
