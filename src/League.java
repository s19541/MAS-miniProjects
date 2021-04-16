import java.util.ArrayList;
import java.util.List;

public class League {
    String name;
    List<String> sponsors;
    List<LeagueClub> leagueClubs = new ArrayList<>();

    public League(String name, List<String> sponsors){
        this.name = name;
        this.sponsors = sponsors;
    }
    public void addClub(Club club){
        if(LeagueClub.exist(this,club)) {
            System.out.println("Liga zawiera już dany klub");
        }
        else{
        leagueClubs.add(new LeagueClub(this,club));
            System.out.println("Pomyslnie dodano klub");
        }
    }
}
