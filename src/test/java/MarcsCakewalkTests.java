import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarcsCakewalkTests {

    @Test
    void testSingleSuccessTest() {
        int[] input = {1,3,2};
        long result = MarcsCakewalk.marcsCakewalk(input);
        Assertions.assertEquals(result, 12);
    }
}
