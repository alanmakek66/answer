package redocustomer;

import java.math.BigDecimal;
import java.util.Arrays;

public class item {
  private String itemName;
  private Double itemprice;
  private int quantity;

  public item(String name, double price, int quantity) {
    this.itemName = name;
    this.itemprice = price;
    this.quantity = quantity;
  }

  public String toString() {
    return "name = " + this.itemName +
        " price = " + this.itemprice + " quantity = " + this.quantity;
  }

  public double subtotal() {
    return BigDecimal.valueOf(this.itemprice) //
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    item item1 = new item("apple", 4.3, 3);
    item item2 = new item("banana", 3.2, 4);
    item item3 = new item("cola", 7.5, 10);

    order order1 = new order("v001");
    order1.add(item3);
    order1.add(item2);
    order1.add(item1);

    System.out.println(order1.toString());
    //System.out.println(item1.subtotal());
    //BigDecimal

    System.out.println(order1.total());

    customer c1=new customer("peter");
    c1.add(order1);
    System.out.println(c1.toString());
    //System.out.println(order1.isFreeship());
    

  }

  

}
