package com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;

import com.bootcamp.customers.Order;
import com.bootcamp.customers.item;


@TestMethodOrder(MethodOrderer.MethodName.class)

public class test1 {
  public static Order o1;
  public static item item1;
  @BeforeAll
  public static void setup(){
    o1=new Order("a123");
    item1 =new item("apple", 5, 5);
  }
    @Test
  void _01_additemToOrder(){
    o1.getItems().add(item1);
    Assertions.assertEquals(1, o1.getItems().size());
    Assertions.assertTrue(o1.getItems().contains(item1));
} 
 @Test
void _03_getorderName(){
  Assertions.assertEquals("a123", o1.getOrderNo());
} 
 
 @Test 
void _04_testtotal(){
  //o1.additem(item1);
  Assertions.assertEquals(25, o1.getTotal());

} 
  
}
