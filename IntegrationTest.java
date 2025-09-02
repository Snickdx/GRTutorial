
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class IntegrationTest {
    
    private Customer owner;
    private Customer renter;
    private Staff staff;
    private Game game;
    
    @Before
    public void setUp() {
        owner = new Customer("gameowner", "ownerpass");
        renter = new Customer("gamerenter", "renterpass");
        staff = new Staff("gamestaff", "staffpass");
        game = new Game("The Witcher 3");
    }
    
    @Test
    public void testCompleteRentalWorkflow() {
        // Owner lists a game
        Listing listing = owner.listGame(game, 29.99f);
        listing.setAvailability(true);
        
        // Staff confirms the listing
        staff.confirmListing(game, owner, 29.99f);
        
        // Renter rents the game
        Rental rental = renter.rentGame(listing);
        
        // Verify rental state
        assertNotNull(rental);
        assertFalse(listing.getAvailability());
        assertEquals(game, rental.getGame());
        
        // Renter returns the game
        renter.returnGame(rental);
        
        // Verify return state
        assertTrue(listing.getAvailability());
        assertNotNull(rental.getEndDate());
    }
    
    @Test
    public void testStaffMediatedWorkflow() {
        // Create listing
        Listing listing = owner.listGame(game, 34.99f);
        listing.setAvailability(true);
        
        // Staff confirms rental
        staff.confirmRental(renter, listing);
        
        // Verify rental occurred
        assertFalse(listing.getAvailability());
        
        // Create rental object for return process
        Rental rental = new Rental(listing, renter);
        
        // Staff confirms return
        staff.confirmReturn(renter, rental);
        
        // Verify return occurred
        assertTrue(listing.getAvailability());
        assertNotNull(rental.getEndDate());
    }
}
