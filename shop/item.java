package shop;

public class item {
  private double price;
  private String desc;
  private int quantity;

  public item(String desc,double price,int quantity){
    this.desc=desc;
    this.price=price;
    this.quantity=quantity;
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

  public String toString(){
    return "Desc = "+this.desc+" Price = "+this.price+" Quantity = "+this.quantity;
  }
  
}
