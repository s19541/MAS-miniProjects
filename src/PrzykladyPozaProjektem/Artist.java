package PrzykladyPozaProjektem;

import java.util.Map;
import java.util.TreeMap;

public class Artist {

    private Map<String, Song> songsQualif = new TreeMap<>();

    public void addSongQualif(Song song) {
        if (!songsQualif.containsKey(song.title)) {
            songsQualif.put(song.title, song);
            song.addArtist(this);
        }
    }
    public Song findSongQualif(String title) throws Exception {
        if(!songsQualif.containsKey(title)) {
            throw new Exception("Unable to find a song: " + title);
        }
        return songsQualif.get(title);
    }

    public void showSongs(){
        System.out.println(songsQualif);
    }
}
