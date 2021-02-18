import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubPalindromeTest {

    @Test
    void testSingleSuccessTest() {
        String input = "mokkori";
        int result = SubPalindrome.palindrome(input);
        Assertions.assertEquals(result,7);
    }
}
