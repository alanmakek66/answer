package listCs;

public class order {
  private int amount;
  private boolean freeShipping;

  public order(int amount){
    this.amount=amount;
    if(amount>100){
      this.freeShipping=true;
    }
  }
  public int getAmount(){
    return this.amount;
  }
  public String toString(){
    return " order = "+this.amount+this.freeShipping;
  }
  
}
