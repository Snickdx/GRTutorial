import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment {
  
  private float amount;
  private Date datePaid;
  private Customer customer;

  public Payment(float amount, Customer customer) {
      this.amount = amount;
      this.customer = customer;
      Date currentDate = new Date();
      this.datePaid = currentDate;
  }

  public float getAmount(){
    return this.amount;
  }

}