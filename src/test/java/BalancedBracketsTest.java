import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBracketsTest {
    @Test
    void testSingleSuccessTest() {
        String input = "}][}}(}][))]";
        String result = BalancedBrackets.isBalanced(input);
        Assertions.assertEquals(result,"Yes");
    }
}
