package Trade;

public class sellSide {
  private double sellPrice;
  private int quantity;

  public sellSide(double sellPrice,int quantity){
    this.sellPrice=sellPrice;
    this.quantity=quantity;

  }

  public double getsellprice(){
    return this.sellPrice;
  }

  public int getquantity(){
    return this.quantity;
  }

  public void setquantity(int quantity){
    this.quantity=quantity;
  }

  public String toString(){
    return " sell price = "+this.sellPrice+" quantity = "+this.quantity;
  }
  
}
