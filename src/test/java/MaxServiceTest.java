import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void shouldFimdMax() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 3;

        int expected = a;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFimdMaxelse() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 8;

        int expected = b;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
