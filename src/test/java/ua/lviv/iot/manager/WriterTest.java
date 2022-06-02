package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.SportFacilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


class WriterTest {

    FacilityWriter writer = new FacilityWriter();

    public static String sep = File.separator;

    Manager manager = new Manager();

    List<SportFacilities> facilities = manager.getList();

    Path path = Paths.get("src" + sep + "test" + sep + "resources" + sep + "test_res.csv");
    Path path2 = Path.of("arenas.csv");


    @Test
    void writeToFile() throws IOException {
        String name1 = "arenas.csv";

        FacilityWriter.writeToFile(facilities, name1);


        try (FileReader test_res = new FileReader(String.valueOf(path));
             BufferedReader testbr = new BufferedReader(test_res);
             FileReader arenas = new FileReader(String.valueOf(path2));
             BufferedReader arenasbr = new BufferedReader(arenas);

        )
        {

            String a;

            String b;

            while ((a = testbr.readLine()) != null & (b = arenasbr.readLine()) != null) {

                Assertions.assertEquals(a, b);
            }

        }

    }
}