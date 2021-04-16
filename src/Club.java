import java.util.ArrayList;
import java.util.List;

public class Club {
    String name;
    List<LeagueClub> leagueClubs = new ArrayList<>();
    public Club(String name){
        this.name=name;
    }
    public void addLeague(League league){
        if(LeagueClub.exist(league, this)) {
            System.out.println("Klub już jest w danej lidze");
        }
        else{
            leagueClubs.add(new LeagueClub(league, this));
            System.out.println("Pomyslnie dodano lige");
        }
    }
}
