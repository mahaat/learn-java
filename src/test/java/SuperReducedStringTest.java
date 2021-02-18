import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuperReducedStringTest {
    @Test
    void testSingleSuccessTest() {
        String input = "aaabccddd";
        String expected = "abd";
        String result = SuperReducedString.superReducedString(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testShouldReturnEmptyString() {
        String input = "aa";
        String expected = "Empty String";
        String result = SuperReducedString.superReducedString(input);
        Assertions.assertEquals(expected, result);
    }
}
