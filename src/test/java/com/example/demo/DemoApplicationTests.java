import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationTests {
    
    @Disabled
    @Test
    public void testAdd() {
        // test addition
        assertEquals(4, add(2, 3));
    }

    @Test
    public void testMultiply() {
        // test mutiplication
        assertEquals(6, multiply(2, 3));
    }

    @Test
    public void testDivide() {
        // test division
        assertEquals(2, divide(6, 3));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
