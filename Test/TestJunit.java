
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test
    public void onePlusOneShouldBeTwo() {
        int sum = 1 + 1;
        assertEquals(2, sum);
    }
}
