package ua.lviv.iot.manager;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import java.io.*;



class WriterTest {

    @Test
    public void Comparing() throws IOException {

        File file = new File("C:\\Users\\User\\lab4\\arenas.csv");
        File file1 = new File("C:\\Users\\User\\lab4\\src\\test\\resources\\expected.csv");
        boolean isTwoEqual = FileUtils.contentEquals(file, file1);
        System.out.println(isTwoEqual);

        File file2 = new File("C:\\Users\\User\\lab4\\arenas1.csv");
        File file3 = new File("C:\\Users\\User\\lab4\\src\\test\\resources\\expected1.csv");
        boolean isTwoEqual1 = FileUtils.contentEquals(file2, file3);
        System.out.println(isTwoEqual1);

        File file4 = new File("C:\\Users\\User\\lab4\\arenas2.csv");
        File file5 = new File("C:\\Users\\User\\lab4\\src\\test\\resources\\expected2.csv");
        boolean isTwoEqual2 = FileUtils.contentEquals(file4, file5);
        System.out.println(isTwoEqual2);


        FacilityWriter facilityWriter = new FacilityWriter();
        facilityWriter.writeToFile();

    }
}