package customerN;

import patternCustomer.iteM.itembuilder;

public class item {
  private String desc;
  private double price;
  private int quantity;

  public item(itembuilder ib1){
    this.desc=ib1.desc;
    this.price=ib1.price;
    this.quantity=ib1.quantity;
  }

  public String getDesc(){
    return this.desc;
  }
  public double getPrice(){
    return this.price;
  }
  public int getQuantity(){
    return this.quantity;
  }
  @Override
  public String toString(){
    return "desc = "+this.desc+", price = "+this.price+" , quantity = "+this.quantity;
  }

  public static class itembuilder{
    private String desc;
  private double price;
  private int quantity;

  public itembuilder desc(String desc){
    this.desc=desc;
    return this;
  }
  public itembuilder price(double price){
    this.price=price;
    return this;
  }
  public itembuilder quantity(int quantity){
    this.quantity=quantity;
    return this;
  }
  public item build(){
    return new item(this);
  }
  }
  
}
