import java.util.ArrayList;
import java.util.List;

public class Club {
    String name;
    private List<LeagueClub> leagueClubs = new ArrayList<>();
    public Club(String name){
        this.name=name;
    }
    public void addLeague(League league){
        if(LeagueClub.exist(league, this)) {
            System.out.println("Klub już jest w danej lidze");
        }
        else{
            LeagueClub leagueClub = new LeagueClub(league, this);
            leagueClubs.add(leagueClub);
            league.addClub(leagueClub);
            System.out.println("Pomyslnie dodano lige");
        }
    }
    public void addLeague(LeagueClub leagueClub){
        if(!leagueClubs.contains(leagueClub))
            leagueClubs.add(leagueClub);
    }
}
