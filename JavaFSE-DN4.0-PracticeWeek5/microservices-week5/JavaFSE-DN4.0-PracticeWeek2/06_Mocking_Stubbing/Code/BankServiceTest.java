import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BankServiceTest {

    @Test
    public void testGetBalanceUsingMock() {
        BankService mockBank = mock(BankService.class);

        when(mockBank.getBalance("123")).thenReturn("Mocked Balance: ₹10000");

        String result = mockBank.getBalance("123");
        assertEquals("Mocked Balance: ₹10000", result);
    }
}
