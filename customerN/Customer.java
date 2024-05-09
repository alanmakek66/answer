package customerN;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Customer {
  private List<Order> orderList;
  private String name;

  public Customer(String name){
    this.name=name;
    this.orderList=new ArrayList<>();
  }
  public List<Order> getOrderList(){
    return this.orderList;
  }
  @Override
  public String toString(){
    return " name = "+this.name+"order list = "+this.orderList;
  }

  public static void main(String[] args) {
    Customer c1=new Customer("sam");
    item it1=new item.itembuilder()
    .desc("apple")
    .price(3.5)
    .quantity(50)
    .build();

    item it2=new item.itembuilder()
    .desc("banana")
    .price(4.5)
    .quantity(20)
    .build();

    item it3=new item.itembuilder()
    .desc("orange")
    .price(5)
    .quantity(30)
    .build();

    item it4=new item.itembuilder()
    .desc("phone")
    .price(5000)
    .quantity(10)
    .build();

    Order o1=new Order("v10000");
    o1.getitemList().add(it4);
    o1.getitemList().add(it3);
    o1.getitemList().add(it2);
    o1.getitemList().add(it1);
    
    c1.getOrderList().add(o1);
    System.out.println(o1);

    System.out.println(c1.getHighestPriceitem());

    
  }
  public item getHighestPriceitem(){
    Optional<item> ii1=this.getOrderList().stream().flatMap(e->e.getitemList().stream())
    .max(Comparator.comparingDouble(e->e.getPrice()));
    return ii1.orElseThrow();
  }
  
}
