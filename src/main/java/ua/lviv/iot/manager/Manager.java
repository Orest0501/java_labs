package ua.lviv.iot.manager;

import ua.lviv.iot.models.BasketballArena;
import ua.lviv.iot.models.FootballStadium;
import ua.lviv.iot.models.IcyArena;
import ua.lviv.iot.models.SportFacilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Manager {



    public List<SportFacilities> getList() {

        List<SportFacilities> TypesOfSport = new ArrayList<>();

        TypesOfSport.add(new BasketballArena(800, "Prometey arena", "Floor", "Volleyball", "Kremenchuk"));
        TypesOfSport.add(new IcyArena(498, "Icy Krym", "Icy", "Curling", 2));
        TypesOfSport.add(new FootballStadium(998, "Ternopil stadium", "Grass","Athletics", "yellow"));
        return TypesOfSport;
    }


    public List<SportFacilities> sortingByTypes(List<SportFacilities> sport) {
        return sport.stream().sorted(Comparator.comparing(SportFacilities::getTypeOfSport)).collect(Collectors.toList());
    }

    public List<SportFacilities> sortingByTypesReversed(List<SportFacilities> sport) {
        return sport.stream().sorted(Comparator.comparing(SportFacilities::getTypeOfSport).reversed()).collect(Collectors.toList());
    }


    public List<SportFacilities> SearchByCapacity (List<SportFacilities> SearchByCapacity) {
        SearchByCapacity = SearchByCapacity.stream().filter(t -> t.getCapacity() > 100 && t.getCapacity() < 1000).collect(Collectors.toList());
        return SearchByCapacity;
    }
}
