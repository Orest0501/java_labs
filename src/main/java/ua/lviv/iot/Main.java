package ua.lviv.iot;


import ua.lviv.iot.manager.Manager;
import ua.lviv.iot.models.BasketballArena;
import ua.lviv.iot.models.FootballStadium;
import ua.lviv.iot.models.IcyArena;
import ua.lviv.iot.models.SportFacilities;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Manager man = new Manager();

        BasketballArena volleyballArena2 = new BasketballArena(800, "Prometey arena", "Floor", "Volleyball", "Kremenchuk");

        IcyArena icyArena2 = new IcyArena(498, "Icy Krym", "Icy", "Curling", 2);

        FootballStadium footballStadium2 = new FootballStadium(998, "Ternopil stadium", "Grass","Athletics", "yellow");

        BasketballArena basketballArena = new BasketballArena(14000,"Lviv Basket Arena", "Floor","Basketball", "Lviv");

        FootballStadium footballStadium = new FootballStadium(68500, "Mykolaiv Stadium", "Grass","Football", "red-black");

        IcyArena icyArena = new IcyArena(19280, "Ternopil Ice", "Ice","Hockey", 8 );

        List<SportFacilities> TypesOfSport = new ArrayList<>();
        TypesOfSport.add(volleyballArena2);
        TypesOfSport.add(icyArena);
        TypesOfSport.add(icyArena2);
        TypesOfSport.add(basketballArena);
        TypesOfSport.add(footballStadium);
        TypesOfSport.add(footballStadium2);


        //   System.out.println("Basketball arena's Capacity: " + basketball_arena.getCapacity() + "," +" Name: " + basketball_arena.getName() + "," + " Type of ground - " + basketball_arena.getType_of_ground() + " , Location - " + basketball_arena.getLocation());

        //  System.out.println("Football stadium's Capacity: " + football_stadium.getCapacity() + "," +" Name: " + football_stadium.getName() + "," + " Type of ground - " + football_stadium.getType_of_ground() + " , Colour - " + football_stadium.getStadium_colour());

        //  System.out.println("Icy arena's Capacity: " + icy_arena.getCapacity()+ "," +" Name: " + icy_arena.getName() + "," + " Type of ground - " + icy_arena.getType_of_ground() + " , number_of_departments - " + icy_arena.getThe_number_of_departments_of_the_sports_complex());

        System.out.println(man.sortingByTypes(TypesOfSport));

        System.out.println(man.sortingByTypesReversed(TypesOfSport));

        System.out.println(man.SearchByCapacity(TypesOfSport));




    }
}
