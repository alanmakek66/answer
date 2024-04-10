package redocustomer;
import java.util.Arrays;

public class customer {

  private String username;
  private order[] orders;

  public customer(String username,order[] order){
    this.username=username;
    this.orders=order;
  }

public String toString(){
  return "Customer(" //
  + "username=" + this.username //
  + ", orders=" + Arrays.toString(this.orders) //
  + ")";
}
  
}
