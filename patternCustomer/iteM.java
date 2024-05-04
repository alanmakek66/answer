package patternCustomer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import listCs.order;

public class iteM {
  private String desc;
  private double price;

  private iteM(itembuilder itb1) {
    this.desc = itb1.desc;
    this.price = itb1.price;

  }
  public String getDesc(){
    return this.desc;
  }

  @Override
  public String toString() {
    return " desc = " + this.desc + " price = " + this.price;
  }

  public static class itembuilder {
    private String desc;
    private double price;

    public itembuilder setdesc(String desc){
      this.desc=desc;
      return this;
      
    }
    public itembuilder setprice(double price){
      this.price=price;
      return this;
      
    }
    public iteM build(){
      return new iteM(this);
    }
    

  }

  public static void main(String[] args) {
    iteM it1=new iteM.itembuilder()
    .setdesc("apple").setprice(7.5).build();
    iteM it2=new iteM.itembuilder()
    .setdesc("banana").setprice(5.2).build();
    iteM it3=new iteM.itembuilder()
    .setdesc("water").setprice(3.2).build();

    Order o1=new Order();
    o1.getitemList().add(it3);
    o1.getitemList().add(it2);
    o1.getitemList().add(it1);
    Customer c1=Customer.builder()
    .setCustomerID(1314520).build();

    c1.getorderList().add(o1);
    List<Order> list1=c1.getorderList();
    List<Order> newlist=list1.stream().flatMap(e->Arrays.asList(e).stream())
    .collect(Collectors.toList());

    System.out.println(newlist);
    


    
    
  }

}
