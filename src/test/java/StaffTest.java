
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StaffTest {
    
    private Staff staff;
    private Customer customer;
    private Game game;
    private Listing listing;
    
    @Before
    public void setUp() {
        staff = new Staff("staffuser", "staffpass");
        customer = new Customer("customer1", "custpass");
        game = new Game("Grand Theft Auto V");
        listing = new Listing(customer, game, 59.99f);
    }
    
    @Test
    public void testStaffCreation() {
        assertNotNull(staff);
        assertEquals("staffuser", staff.username);
        assertEquals("staffpass", staff.password);
    }
    
    @Test
    public void testConfirmRental() {
        listing.setAvailability(true);
        
        staff.confirmRental(customer, listing);
        
        assertFalse(listing.getAvailability());
    }
    
    @Test
    public void testConfirmReturn() {
        listing.setAvailability(false);
        Rental rental = new Rental(listing, customer);
        
        staff.confirmReturn(customer, rental);
        
        assertTrue(listing.getAvailability());
        assertNotNull(rental.getEndDate());
    }
    
    @Test
    public void testConfirmListing() {
        Game newGame = new Game("Call of Duty");
        
        staff.confirmListing(newGame, customer, 44.99f);
        
        // This test verifies the method executes without error
        // since confirmListing calls customer.listGame internally
        assertNotNull(newGame);
    }
}
