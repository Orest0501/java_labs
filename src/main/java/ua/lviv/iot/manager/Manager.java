package ua.lviv.iot.manager;

import ua.lviv.iot.models.SportFacilities;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Manager {

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
