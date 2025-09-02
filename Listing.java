import java.text.SimpleDateFormat;
import java.util.Date;

public class Listing {

  private Date dateListed;
  private Customer owner;
  private Game game;
  private float price;
  private boolean available;

  public Listing( Customer customer, Game game, float amount) {
 
  }

  public void setAvailability(boolean availibility){
    // Stubbed - do nothing
  }

  public boolean getAvailability(){
    return false;
  }

  public float getPrice(){
    return 0.0f;
  }

  public Game getGame(){
    return null;
  }

}
