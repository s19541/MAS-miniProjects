import Persons.*;
import Enums.*;
import PrzykladyPozaProjektem.Artist;
import PrzykladyPozaProjektem.Song;
import PrzykladyPozaProjektem.Verse;

import javax.lang.model.type.ArrayType;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Worker worker1 = new Worker(999999999,"Marek","Kowalski",4000,LocalDate.now());
        Supporter supporter1 = new Supporter(666777888, "Marcin", "Majkut");
        supporter1.setEmailAddress("MarcinMarcin@gmail.com");
        Supporter supporter2 = new Supporter(555555555,"Jan","Nowak",true);
        Player player1 = new Player(222232222,"Robert","Lewandowski",50000,LocalDate.now(), Position.Attacker,9);
        Player player2 = new Player(222222222,"Cristiano","Ronaldo",80000,LocalDate.now(), Position.Attacker,7);
        Player player3 = new Player(222245222,"Wojciech","Szczęsny",30000,LocalDate.now(), Position.Goalkeeper,1);
        Player player4 = new Player(222224222,"Sergio","Ramos",40000,LocalDate.now(), Position.Defender,4);
        Player player5 = new Player(222222256,"Bruno","Fernandes",35000,LocalDate.now(), Position.Midfielder,10);
        Coach coach1 = new Coach(231323231,"Jerzy","Brzęczek",2000,LocalDate.now(), CoachRole.Main);
        Match match = new Match(LocalDateTime.now(), 20, 20000, new Club("Real Madryt"), Arrays.asList(player1,player2,player3,player4,player5));
        match.showMatchSquad();
        System.out.println(Match.maxSupportersNumber);
        Match.changeMaxSupportersNumber(20000);
        System.out.println(Match.maxSupportersNumber);
        ExtensionManager.loadExtensions();
        Person.showExtent();
        ExtensionManager.saveExtensions();*/
        //MP2
        //asocjacja zwykla
        Pitch pitch = new Pitch(222,"Jana Pawła 2 43a");
        Pitch pitch2 = new Pitch(332,"Marszałkowska 233");
        Training t1 = new Training(LocalDateTime.now());
        Training t2 = new Training(LocalDateTime.now());
        pitch.addTraining(t1);
        pitch.addTraining(t2);
        System.out.println(pitch);
        pitch2.addTraining(t1);
        System.out.println(pitch);

        //asocjacja z atrybutem
        League league1 = new League("Premier League", Arrays.asList("Nike","McDonald"));
        Club club1 = new Club("Manchester United");
        Club club2 = new Club("Manchester City");
        Club club3 = new Club("Liverpool");
        league1.addClub(club1);
        league1.addClub(club1);
        club2.addLeague(league1);
        club3.addLeague(league1);
        System.out.println(league1.leagueClubs);
        System.out.println(club1.leagueClubs);
        //asocjacja kwalifikowana
        Song song = new Song("Dwutakt");
        Artist artist = new Artist();
        artist.addSongQualif(song);
        try {
            System.out.println(artist.findSongQualif("Dwutakt"));
            System.out.println(artist.findSongQualif("Szklanki"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //kompozycja
        try {
            Verse verse = Verse.createVerse(song, 1, 52);
            Verse.createVerse(song, 2, 53);
            try {
                Verse.createVerse(null, 1, 53);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            try {
                Song song2 = new Song("testSong");
                Verse.createVerse(song2, 3, 34);
                song2.addVerse(verse);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(artist.findSongQualif("Dwutakt"));
            System.out.println("Metoda klasowa:");
            Verse.showVersesWithMinimalNumberOfWords(40);
            Verse.showExtent();
            Song.removeSong(song);
            Verse.showExtent();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
