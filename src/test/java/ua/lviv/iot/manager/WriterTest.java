package ua.lviv.iot.manager;

import org.junit.jupiter.api.Test;
import java.io.IOException;

class WriterTest {

    @Test
    public void WriterTest() throws IOException {

        FacilityWriter facilityWriter = new FacilityWriter();
  facilityWriter.writeToFile();

}}