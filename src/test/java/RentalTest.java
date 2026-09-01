
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Date;

public class RentalTest {
    
    private Rental rental;
    private Customer customer;
    private Listing listing;
    private Game game;
    
    @Before
    public void setUp() {
        customer = new Customer("renter", "rentpass");
        game = new Game("Minecraft");
        listing = new Listing(customer, game, 19.99f);
        rental = new Rental(listing, customer);
    }
    
    @Test
    public void testRentalCreation() {
        assertNotNull(rental);
        assertEquals(listing, rental.getListing());
        assertEquals(game, rental.getGame());
        assertNull(rental.getEndDate());
    }
    
    @Test
    public void testDoReturn() {
        listing.setAvailability(false);
        
        rental.doReturn();
        
        assertTrue(listing.getAvailability());
        assertNotNull(rental.getEndDate());
    }
    
    @Test
    public void testGetGame() {
        assertEquals(game, rental.getGame());
    }
    
    @Test
    public void testGetListing() {
        assertEquals(listing, rental.getListing());
    }
}
