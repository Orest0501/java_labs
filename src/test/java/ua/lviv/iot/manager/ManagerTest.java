package ua.lviv.iot.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.SportFacilities;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

        Manager man = new Manager();

        List<SportFacilities> sport1 = man.sortingByTypes(man.getList());

        String sport1param0 = "Athletics";
        String sport1param1 = "Curling";
        String sport1param2 = "Volleyball";

        List<SportFacilities> sport2 = man.sortingByTypesReversed(man.getList());

        String sport2param0 = "Volleyball";
        String sport2param1 = "Curling";
        String sport2param2 = "Athletics";

        List<SportFacilities> sport3 = man.SearchByCapacity(man.getList());

        int capacity1 = 800;
        int capacity2 = 498;
        int capacity3 = 998;

        @Test
        void sortingByTypes() {
            assertEquals(sport1param0, sport1.get(0).getTypeOfSport());
            assertEquals(sport1param1, sport1.get(1).getTypeOfSport());
            assertEquals(sport1param2, sport1.get(2).getTypeOfSport());
        }

        @Test
        void sortingByTypesReversed () {
            assertEquals(sport2param0, sport2.get(0).getTypeOfSport());
            assertEquals(sport2param1, sport2.get(1).getTypeOfSport());
            assertEquals(sport2param2, sport2.get(2).getTypeOfSport());
        }

        @Test
        void searchByCapacity () {
            assertEquals(capacity1, sport3.get(0).getCapacity());
            assertEquals(capacity2, sport3.get(1).getCapacity());
            assertEquals(capacity3, sport3.get(2).getCapacity());
        }

    }
