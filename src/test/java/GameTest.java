
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GameTest {
    
    private Game game;
    
    @Before
    public void setUp() {
        game = new Game("Final Fantasy VII");
    }
    
    @Test
    public void testGameCreation() {
        assertNotNull(game);
    }
    
    @Test
    public void testGameWithEmptyTitle() {
        Game emptyGame = new Game("");
        assertNotNull(emptyGame);
    }
    
    @Test
    public void testGameWithNullTitle() {
        Game nullGame = new Game(null);
        assertNotNull(nullGame);
    }
}
