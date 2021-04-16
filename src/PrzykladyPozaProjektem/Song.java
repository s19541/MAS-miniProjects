package PrzykladyPozaProjektem;

import Persons.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song {
    String title;
    List<Artist> artists = new ArrayList<>();
    private List<Verse> verses = new ArrayList<>();
    private static Set<Verse> allVerses = new HashSet<>();
    private static List<Song> extent = new ArrayList<>();

    public Song(String title){
        this.title=title;
        extent.add(this);
    }
    public void addArtist(Artist artist){
        if(!artists.contains(artist))
            artists.add(artist);
    }
    public void addVerse(Verse verse) throws Exception {
        if(!verses.contains(verse)) {
            if(allVerses.contains(verse)) {
                throw new Exception("This verse is already connected with another song!");
            }
            verses.add(verse);
            allVerses.add(verse);
        }
    }
    public static void removeSong(Song song){
        extent.remove(song);
        for(Verse verse: song.verses){
            Verse.removeVerse(verse);
        }
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artists=" + artists +
                ", verses=" + verses +
                '}';
    }
}
