public class Staff extends User {

    public Staff(String username, String password){
      this.username = username;
      this.password = password;
    }

    public void confirmRental(Customer renter, Listing listing) {
        // Stubbed - do nothing
    }

    public void confirmReturn(Customer renter, Rental rental) {
        // Stubbed - do nothing
    }

    public void confirmListing(Game game, Customer owner, Float price) {
        // Stubbed - do nothing
    }

}