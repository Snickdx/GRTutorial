
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PaymentTest {
    
    private Payment payment;
    private Customer customer;
    
    @Before
    public void setUp() {
        customer = new Customer("payuser", "paypass");
        payment = new Payment(49.99f, customer);
    }
    
    @Test
    public void testPaymentCreation() {
        assertNotNull(payment);
        assertEquals(49.99f, payment.getAmount(), 0.01);
    }
    
    @Test
    public void testGetAmount() {
        assertEquals(49.99f, payment.getAmount(), 0.01);
    }
    
    @Test
    public void testPaymentWithZeroAmount() {
        Payment zeroPayment = new Payment(0.0f, customer);
        assertEquals(0.0f, zeroPayment.getAmount(), 0.01);
    }
    
    @Test
    public void testPaymentWithNegativeAmount() {
        Payment negativePayment = new Payment(-10.0f, customer);
        assertEquals(-10.0f, negativePayment.getAmount(), 0.01);
    }
}
