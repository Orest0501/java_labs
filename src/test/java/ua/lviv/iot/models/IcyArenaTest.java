package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcyArenaTest {

    private int capacity = 19280;
    private String name = "Ternopil Ice";
    private String typeOfGround = "Ice";
    private String typeOfSport = "Hockey";
    private int theNumberOfDepartmentsOfTheSportsComplex = 8;

    IcyArena icyArena = new IcyArena(19280, "Ternopil Ice", "Ice","Hockey", 8 );

    String str2 = "IcyArena{" +
            "theNumberOfDepartmentsOfTheSportsComplex=" + theNumberOfDepartmentsOfTheSportsComplex +
            ", capacity=" + capacity +
            ", name='" + name + '\'' +
            ", typeOfGround='" + typeOfGround + '\'' +
            ", typeOfSport='" + typeOfSport + '\'' +
            '}';

    @Test
    void testToString() {assertEquals(str2, icyArena.toString());
    }
}