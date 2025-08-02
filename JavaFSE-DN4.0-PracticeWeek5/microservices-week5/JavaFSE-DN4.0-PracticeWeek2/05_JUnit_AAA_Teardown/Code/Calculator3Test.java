import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator3Test {

    private Calculator3 calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator3();  // Arrange
    }

    @Test
    public void testAdd() {
        int result = calculator.add(10, 5);  // Act
        assertEquals(15, result);           // Assert
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }
}
