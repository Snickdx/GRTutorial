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
      // Stubbed - do nothing
    }

    public Date getEndDate(){
      return null;
    }

    public Game getGame(){
      return null;
    }

    public Listing getListing(){
      return null;
    }

}