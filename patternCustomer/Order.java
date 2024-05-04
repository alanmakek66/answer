package patternCustomer;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<iteM> itemlist;

  public Order(){
    this.itemlist=new ArrayList<>();
    
  }
  public List<iteM> getitemList(){
    return this.itemlist;
  }
  @Override
  public String toString(){
    return " item List = "+this.itemlist;
  }
  
}
