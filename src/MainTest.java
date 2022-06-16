import java.util.regex.Pattern;

class MainTest {

    final String regex = ".*[a-zA-Z]+-[a-zA-Z]+.*[a-zA-Z]+-[a-zA-Z]+.*\n";
    final String string = "First sentence! \n"
            + "Second sentence with one-hyphen. \n"
            + "Third sentence with-two hyphen-s ! \n"
            + "Another sentence with-one hyphen! \n"
            + "Many many-many many many-many many many-many many hyphens! \n"
            + "Third sentence with-two hyphen-s!\n";

    @org.junit.jupiter.api.Test
    void main() {

        System.out.println(Pattern.compile(regex).matcher(string).find());













    }
}