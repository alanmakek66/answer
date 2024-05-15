package com.bootcamp.customers;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Order {
  private String orderNo;
  private List<item> items;
  private List<item2> items2;

  public Order(String orderNo) {
    this.orderNo = orderNo;
    this.items = new ArrayList<>();
    this.items2=new ArrayList<>();

  }

  public void additem(item item1) {
    this.getItems().add(item1);
  }
  public void additem2(item2 item2){
    this.getItems2().add(item2);
  }

  

  public double getTotal() {
    double total = 0.0;
    for (int i = 0; i < this.getItems().size(); i++) {
      total = total + (this.getItems().get(i).getPrice() * this.getItems().get(i).getQuantity());

    }
    return total;
  }

  public double getTotal2() {
    double total2 = 0.0;
    for (int i = 0; i < this.getItems2().size(); i++) {
      total2 = total2 + (this.getItems2().get(i).getPrice() * this.getItems2().get(i).getQuantity());

    }
    return total2;
  }


   public static void main(String[] args) {
    item i1=new item("app", 5, 5);
    item i2=new item("app", 5, 5);
    Order o1=new Order("asd");
    o1.additem(i1);
    o1.additem(i2);
    System.out.println(o1.getTotal());

    Order o2=new Order("ddd");
    o2.additem2(item2.apple);
    System.out.println(o2.getTotal2());
  } 

}
