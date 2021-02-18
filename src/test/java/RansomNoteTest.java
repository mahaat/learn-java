import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    @Test
    void testSingleSuccessTest() {
        String[] magazine = {"give",  "me",  "one", "grand",  "today",  "night"};
        String[] note = {"give", "one",  "grand", "today"};
        String result = RansomNote.checkMagazine(magazine, note);
        Assertions.assertEquals(result,"Yes");
    }

    @Test
    void testSingleFailureTest() {
        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};
        String result = RansomNote.checkMagazine(magazine, note);
        Assertions.assertEquals(result,"No");
    }
}
