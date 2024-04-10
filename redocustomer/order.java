package redocustomer;
import java.util.Arrays;

public class order {
  private String orderNo;
  private item[] items;

  public order(String orderNo,item[] items){
    this.orderNo=orderNo;
    this.items=items;
  }

  public String toString() {
    return "Order(" //
        + "orderNo=" + this.orderNo //
        + ", items=" + Arrays.toString(this.items) //
        + ")";
  }
  public void add(){
    
  }
  
}
