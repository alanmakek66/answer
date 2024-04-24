package Trade;

public class buySide {
  private double buyPrice;
  private int quantity;

  public buySide(double buyPrice,int quantity){
    this.buyPrice=buyPrice;
    this.quantity=quantity;
  }

    public double getbuyprice(){
      return this.buyPrice;
    }

    public int getquantity(){
      return this.quantity;
    }

    public void setquantity(int quantity){
      this.quantity=quantity;

    }

    

    public String toString(){
      return "buy price = "+this.buyPrice+" quantity = "+this.quantity;
    }

    

  }
  

