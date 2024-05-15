package com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import com.bootcamp.customers.Order;
import com.bootcamp.customers.item;
import com.bootcamp.customers.item2;

public class test2 {
  
  public static Order o1;
  @BeforeAll
    public static void setup() {
        
        o1=new Order("v0001");
}
@Test  void testadditem2(){
  o1.additem2(item2.apple);
  Assertions.assertEquals(1, o1.getItems2().size());
  Assertions.assertTrue(o1.getItems2().contains(item2.apple));
}

@Test 
void testgetTotal2(){
  Assertions.assertEquals(22.5, o1.getTotal2());
}







  /* @Test
  void additemToOrder(){
    o1.getItems().add(item1);
    Assertions.assertEquals(1, o1.getItems().size());
    Assertions.assertTrue(o1.getItems().contains(item1));
} */
/* @Test
void getorderName(){
  Assertions.assertEquals("v0001", o1.getOrderNo());
} */
 
/* @Test 
void testtotal(){
  Assertions.assertEquals(400, o1.getTotal());

} */
}
  

