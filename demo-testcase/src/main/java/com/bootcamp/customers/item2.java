package com.bootcamp.customers;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter

@ToString


public enum item2 {
  apple(4.5,5),
  banana(5.5,10),;
  private double price;
  private int quantity;

  private item2(double price,int quantity){
    this.price=price;
    this.quantity=quantity;
  }
  
}
