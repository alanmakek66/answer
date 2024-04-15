package redocustomer;

import java.util.Arrays;

public class customer {
  private String name;
  private order[] orders;
  private address[] address;

  public customer(String name){
    this.name=name;
    this.orders=new order[0];
  }

  public void add(order order) {
    order[] copyArr = this.orders;
    this.orders = new order[this.orders.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.orders[idx++] = copyArr[i];
    }
    this.orders[idx] = order;
  }

  public String toString(){
    return "customer name = "+this.name
    +" order = "+Arrays.toString(this.orders)
    +" address = "+Arrays.toString(this.address);
  }


}
