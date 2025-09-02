import java.text.SimpleDateFormat;
import java.util.Date;


public class Rental {

    private Date startDate;  
    private Date endDate;    
    private Customer renter;
    private Listing listing;

    public Rental(Listing listing, Customer renter) {
      this.listing = listing;
      this.renter = renter;
      Date currentDate = new Date();
      this.startDate = currentDate;
    }

    public void doReturn(){
      Date currentDate = new Date();;
      this.listing.setAvailability(true);
      this.endDate = currentDate;
    }

    public Date getEndDate(){
      return this.endDate;
    }

    public Game getGame(){
      return this.listing.getGame();
    }

    public Listing getListing(){
      return this.listing;
    }

}