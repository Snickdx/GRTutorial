public class Staff extends User {

    public Staff(String username, String password){
      this.username = username;
      this.password = password;
    }

    public void confirmRental(Customer renter, Listing listing) {
        renter.rentGame(listing);
    }

    public void confirmReturn(Customer renter, Rental rental) {
        renter.returnGame(rental);
    }

    public void confirmListing(Game game, Customer owner, Float price) {
        owner.listGame(game, price);
    }

}