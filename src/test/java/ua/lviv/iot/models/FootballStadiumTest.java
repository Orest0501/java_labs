package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballStadiumTest {
    private int capacity = 68500;
    private String name = "Mykolaiv Stadium";
    private String typeOfGround = "Grass";
    private String typeOfSport = "Football";
    private String stadiumColour = "red-black";

    FootballStadium footballStadium = new FootballStadium(68500, "Mykolaiv Stadium", "Grass", "Football", "red-black");

    String str1 ="FootballStadium{" +
            "stadiumColour='" + stadiumColour + '\'' +
            ", capacity=" + capacity +
            ", name='" + name + '\'' +
            ", typeOfGround='" + typeOfGround + '\'' +
            ", typeOfSport='" + typeOfSport + '\'' +
            '}';

    @Test
    void testToString() {assertEquals(str1, footballStadium.toString());
    }
}