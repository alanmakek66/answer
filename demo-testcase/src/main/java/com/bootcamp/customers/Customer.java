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
public class Customer {
  private List<Order> orders;
  private String name;

  public Customer(String name){
    this.name=name;
    orders=new ArrayList<>();
  }
  
}
