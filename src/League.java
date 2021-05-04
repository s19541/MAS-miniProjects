import java.util.ArrayList;
import java.util.List;

public class League {
    String name;
    List<String> sponsors;
    private List<LeagueClub> leagueClubs = new ArrayList<>();

    public League(String name, List<String> sponsors){
        this.name = name;
        this.sponsors = sponsors;
    }
    public void addClub(Club club){
        if(LeagueClub.exist(this,club)) {
            System.out.println("Liga zawiera już dany klub");
        }
        else{
            LeagueClub leagueClub = new LeagueClub(this,club);
        leagueClubs.add(leagueClub);
        club.addLeague(leagueClub);
            System.out.println("Pomyslnie dodano klub");
        }
    }
    public void addClub(LeagueClub leagueClub){
        if(!leagueClubs.contains(leagueClub))
            leagueClubs.add(leagueClub);
    }
    public void showClubs(){
        System.out.println(leagueClubs);
    }
}
