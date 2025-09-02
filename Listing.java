import java.text.SimpleDateFormat;
import java.util.Date;

public class Listing {

  private Date dateListed;
  private Customer owner;
  private Game game;
  private float price;
  private boolean available;

  public Listing( Customer customer, Game game, float amount) {
    this.price = amount;
    this.game = game;
    this.owner = customer;
    Date currentDate = new Date();
    this.dateListed = currentDate;
  }

  public void setAvailability(boolean availibility){
    this.available = availibility;
  }

  public boolean getAvailability(){
    return this.available;
  }

  public float getPrice(){
    return this.price;
  }

  public Game getGame(){
    return this.game;
  }

}
