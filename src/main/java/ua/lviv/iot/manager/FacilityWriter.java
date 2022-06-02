package ua.lviv.iot.manager;

import ua.lviv.iot.models.SportFacilities;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class FacilityWriter {

    public static void writeToFile(List<SportFacilities> facilities, String name) throws IOException {

        try (FileWriter writer = new FileWriter(name)) {
            facilities.stream().sorted(Comparator.comparing(SportFacilities::getTypeOfSport)).collect(Collectors.toList());

            String previousClassName = "";

            for (var app : facilities) {

                if (!app.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(app.getHeaders());
                    writer.write("\r\n");
                    writer.write(app.toCSV());
                    writer.write("\r\n");
                    previousClassName = app.getClass().getSimpleName();
                }
            }
        }
    }
}