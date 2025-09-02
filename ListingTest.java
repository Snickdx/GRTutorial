
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ListingTest {
    
    private Listing listing;
    private Customer customer;
    private Game game;
    
    @Before
    public void setUp() {
        customer = new Customer("owner", "pass123");
        game = new Game("Pokemon Red");
        listing = new Listing(customer, game, 24.99f);
    }
    
    @Test
    public void testListingCreation() {
        assertNotNull(listing);
        assertEquals(24.99f, listing.getPrice(), 0.01);
        assertEquals(game, listing.getGame());
    }
    
    @Test
    public void testSetAvailability() {
        listing.setAvailability(true);
        assertTrue(listing.getAvailability());
        
        listing.setAvailability(false);
        assertFalse(listing.getAvailability());
    }
    
    @Test
    public void testGetPrice() {
        assertEquals(24.99f, listing.getPrice(), 0.01);
    }
    
    @Test
    public void testGetGame() {
        assertEquals(game, listing.getGame());
    }
}
