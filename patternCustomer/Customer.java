package patternCustomer;

import java.util.ArrayList;
import java.util.List;

import bank.customer;
import redocustomer.item;

public class Customer {
  private int customerID;
  private List<Order> orders;

  private Customer(customerbuilder b1) {
    this.customerID = b1.customerID;
    this.orders = new ArrayList<>();
  }
  public int getcustomerID(){
    return this.customerID;
  }
  public List<Order> getorderList(){
    return this.orders;
  }

  @Override
  public String toString() {
    return " customerID = " + this.customerID + " orders = " + this.orders;
  }

  public static customerbuilder builder() {
    return new customerbuilder();
  }

  public static class customerbuilder {
    private int customerID;
    private List<Order> orders;

    public customerbuilder setCustomerID(int currentID) {
      this.customerID = currentID;
      return this;

    }

    public Customer build() {
      return new Customer(this);
    }

  }

  public static void main(String[] args) {
    Customer c1=Customer.builder().setCustomerID(1314).build();
    c1.getorderList().add();
    
  }

}
