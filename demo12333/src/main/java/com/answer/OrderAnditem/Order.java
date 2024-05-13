package com.answer.OrderAnditem;

import java.util.ArrayList;
import java.util.List;

import com.answer.OrderAnditem.item.itemBuilder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Order {
  private String orderNo;
  private List<item> itemList;

  public Order(String orderNo) {
    this.orderNo = orderNo;
    this.itemList = new ArrayList<>();
  }

  public static void main(String[] args) {
    item item1 = item.builder()
        .desc("apple")
        .price(10.0)
        .quantity(5)
        .build();
    System.out.println(item1);
    Order o1=new Order("v0001");
    o1.getItemList().add(item1);
    System.out.println(o1);
  }
}
