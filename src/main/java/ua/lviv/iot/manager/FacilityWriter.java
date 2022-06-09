package ua.lviv.iot.manager;

import ua.lviv.iot.models.BasketballArena;
import ua.lviv.iot.models.FootballStadium;
import ua.lviv.iot.models.IcyArena;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FacilityWriter {

    public void writeToFile() throws IOException {

        BasketballArena volleyballArena2 = new BasketballArena(800, "Prometey arena", "Floor", "Volleyball", "Bucha");
        IcyArena icyArena = new IcyArena(19280, "Ternopil Ice", "Ice","Hockey", 8 );
        FootballStadium footballStadium = new FootballStadium(68500, "Mykolaiv Stadium", "Grass", "Football", "red-black");

        BufferedWriter writer = new BufferedWriter(new FileWriter("arenas.csv"));
        writer.write(volleyballArena2.getHeaders());
        writer.write("\r\n");
        writer.write(volleyballArena2.toCSV());
        writer.close();

        BufferedWriter writer1 = new BufferedWriter(new FileWriter("arenas1.csv"));
        writer1.write(footballStadium.getHeaders());
        writer1.write("\r\n");
        writer1.write(footballStadium.toCSV());
        writer1.close();

        BufferedWriter writer2 = new BufferedWriter(new FileWriter("arenas2.csv"));
        writer2.write(icyArena.getHeaders());
        writer2.write("\r\n");
        writer2.write(icyArena.toCSV());
        writer2.close();



}}