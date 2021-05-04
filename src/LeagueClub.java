import Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class LeagueClub {
    private League league;
    private Club club;
    private int matchPlayed;
    private int matchWon;
    private int matchDrawn;
    private int matchLost;
    private int goalsFor;
    private int goalsAgainst;
    private int goalsDifference;
    private int points;
    private static List<LeagueClub> extent = new ArrayList<>();

    public LeagueClub(League league, Club club){
        this.league = league;
        this.club = club;
        extent.add(this);
    }
    public static boolean exist(League league, Club club){
        for( LeagueClub leagueClub : extent ){
            if(leagueClub.league == league && leagueClub.club == club)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "LeagueClub{" +
                "league=" + league.name +
                ", club=" + club.name +
                ", matchPlayed=" + matchPlayed +
                ", matchWon=" + matchWon +
                ", matchDrawn=" + matchDrawn +
                ", matchLost=" + matchLost +
                ", goalsFor=" + goalsFor +
                ", goalsAgainst=" + goalsAgainst +
                ", goalsDifference=" + goalsDifference +
                ", points=" + points +
                '}';
    }
}
