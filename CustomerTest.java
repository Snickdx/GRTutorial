
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CustomerTest {
    
    private Customer customer;
    private Game game;
    private Listing listing;
    
    @Before
    public void setUp() {
        customer = new Customer("testuser", "password123");
        game = new Game("Super Mario Bros");
        listing = new Listing(customer, game, 29.99f);
    }
    
    @Test
    public void testCustomerCreation() {
        assertEquals("testuser", customer.getUsername());
        assertEquals("password123", customer.getPassword());
    }
    
    @Test
    public void testListGame() {
        Game newGame = new Game("Zelda");
        Listing newListing = customer.listGame(newGame, 39.99f);
        
        assertNotNull(newListing);
        assertEquals(39.99f, newListing.getPrice(), 0.01);
        assertEquals(newGame, newListing.getGame());
    }
    
    @Test
    public void testRentGame() {
        listing.setAvailability(true);
        Rental rental = customer.rentGame(listing);
        
        assertNotNull(rental);
        assertEquals(listing, rental.getListing());
        assertEquals(game, rental.getGame());
        assertFalse(listing.getAvailability());
    }
    
    @Test
    public void testReturnGame() {
        listing.setAvailability(false);
        Rental rental = new Rental(listing, customer);
        
        customer.returnGame(rental);
        
        assertTrue(listing.getAvailability());
        assertNotNull(rental.getEndDate());
    }
}
