import Persons.Player;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Match {
    LocalDateTime dateTime;
    float ticketPrize;
    int supportersNumber;
    static int maxSupportersNumber = 30000;
    Club opponent;
    List<Player> players = new ArrayList<>();
    public Match(LocalDateTime dateTime, float ticketPrize, int supportersNumber, Club opponent){
        this.dateTime = dateTime;
        this.ticketPrize = ticketPrize;
        this.supportersNumber = supportersNumber;
        this.opponent = opponent;
    }
    public Match(LocalDateTime dateTime, float ticketPrize, int supportersNumber, Club opponent, List<Player> players){
        this.dateTime = dateTime;
        this.ticketPrize = ticketPrize;
        this.supportersNumber = supportersNumber;
        this.opponent = opponent;
        this.players = players;
    }
    public void showMatchSquad(){
        System.out.println("Match Squad:");
        for(Player player : players){
            System.out.println(player.getFirstName() + " " + player.getLastName());
        }
    }
    public static void changeMaxSupportersNumber(int newNumber){
        maxSupportersNumber = newNumber;
    }
}
