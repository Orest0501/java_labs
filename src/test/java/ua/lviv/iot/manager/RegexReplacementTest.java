package ua.lviv.iot.manager;


import org.junit.jupiter.api.Test;
import ua.lviv.iot.Regex.RegexReplacement;
import static org.junit.jupiter.api.Assertions.assertEquals;


class RegexReplacementTest {

    @Test
    void replaceHyphensTest() {
        RegexReplacement regexReplacement = new RegexReplacement();

        assertEquals(regexReplacement.replaceHyphens(), "First sentence!\n" +
                                                        "Second sentence with one-hyphen.\n" +
                                                        "\n" +
                                                        "Another sentence with-one hyphen!\n" +
                                                        "\n" +
                                                        "\n");























    }
}
