import java.util.List;
import java.util.ArrayList;


public class Customer extends User {

  
    public Customer(String username, String password){     
      this.username = username;
      this.password = password;
    }

    private Payment makePayment(float amount) {
        return null;
    }

    public Rental rentGame(Listing listing) {
        return null;
    }

    public void returnGame(Rental rental){
      // Stubbed - do nothing
    }
  
    public Listing listGame(Game game, float amount) {
        return null;
    }

    public String getUsername(){
      return null;
    }

    public String getPassword(){
      return null;
    }

    
}