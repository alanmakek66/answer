package customerN;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<item> itemList;
  private String OrderNO;
  
  public Order(String OrderNO){
    this.OrderNO=OrderNO;
    this.itemList=new ArrayList<>();
  }
  public List<item> getitemList(){
    return this.itemList;
  }
  @Override
  public String toString(){
    return "Order Number = "+this.OrderNO+" item list = "+this.itemList;
  }

  public static void main(String[] args) {
    
  }
  
  
}
