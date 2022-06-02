package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketballArenaTest {

    private int capacity = 800;
    private String name = "Prometey arena";
    private String typeOfGround = "Floor";
    private String typeOfSport = "Volleyball";
    private String location = "Bucha";

    BasketballArena volleyballArena2 = new BasketballArena(800, "Prometey arena", "Floor", "Volleyball", "Bucha");

    String str = "BasketballArena{" +
            "location='" + location + '\'' +
            ", capacity=" + capacity +
            ", name='" + name + '\'' +
            ", typeOfGround='" + typeOfGround + '\'' +
            ", typeOfSport='" + typeOfSport + '\'' +
            '}';
    @Test
    void testToString() {
        assertEquals(str, volleyballArena2.toString());
    }
}