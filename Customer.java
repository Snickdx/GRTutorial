import java.util.List;
import java.util.ArrayList;


public class Customer extends User {

  
    public Customer(String username, String password){     
      this.username = username;
      this.password = password;
    }

    private Payment makePayment(float amount) {
        Payment newPayment = new Payment(amount, this);
        return newPayment;
    }

    public Rental rentGame(Listing listing) {
        Rental newRental = new Rental(listing, this);
        listing.setAvailability(false);
        this.makePayment(listing.getPrice());
        return newRental;
    }

    public void returnGame(Rental rental){
      rental.doReturn();
    }
  
    public Listing listGame(Game game, float amount) {
        Listing newListing = new Listing(this, game, amount);
        return newListing;
    }

    public String getUsername(){
      return this.username;
    }

    public String getPassword(){
      return this.password;
    }

    
}