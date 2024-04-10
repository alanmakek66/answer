package redocustomer;
import java.util.Arrays;

public class item {
  private double price;
  private int quantity;
  private String desc; //refer to describe;

  public item(String desc,double price,int quantity){
    this.desc=desc;
    this.price=price;
    this.quantity=quantity;
  }

  public String toString() {
    return "Item(" //
        + "description=" + this.desc //
        + ", price=" + this.price //
        + ", quantity=" + this.quantity //
        + ")";
  }

  public static void main(String[] args) {
    item item1=new item("apple", 4.5, 2);
    item itme2=new item("orange", 3.5, 3);
    item[] items=new item[2];
    items[0]=item1;
    items[1]=itme2;
    order order1=new order("v000022", items);

    order [] orders=new order[1];
    orders[0]=order1;
    customer c=new customer("sallychan", orders);
  }
  
}
