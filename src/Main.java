import Enums.CoachRole;
import Enums.Position;
import Persons.*;

import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Worker worker1 = new Worker(999999999,"Marek","Kowalski",4000,LocalDate.now());
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
        match.showMatchSquad();*/
        ExtensionManager.loadExtensions();
        Person.showExtent();
        ExtensionManager.saveExtensions();
    }
}
