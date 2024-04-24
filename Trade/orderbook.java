package Trade;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class orderbook {
  private ArrayList<buySide> buyS;
  private ArrayList<sellSide> sellS;

  public orderbook(){
    this.buyS=new ArrayList<>();
    this.sellS=new ArrayList<>();
  }

  public ArrayList<buySide> getArrBuy(){
    return this.buyS;
  }

  public ArrayList<sellSide> getArrSell(){
    return this.sellS;
  }

  public void sortBUYandSELL(){
    Collections.sort(this.buyS, new sortbyPriceBUY());
    Collections.sort(this.sellS, new sortbyPriceSELL());
  }

  /* public void trade(){

    this.sortBUYandSELL();


    if(this.getArrBuy().get(0).getbuyprice()>=this.getArrSell().get(0).getsellprice()
    &&this.getArrBuy().get(0).getquantity()>=this.getArrSell().get(0).getquantity()){
System.out.println(" trade completed deal price = "+this.getArrSell().get(0).getsellprice());
this.getArrSell().remove(0);
      
    }
  } */

  public void trade() {
    this.sortBUYandSELL();

    if (this.getArrBuy().isEmpty() || this.getArrSell().isEmpty()) {
        System.out.println("No trades available.");
        return;
    }

    double buyPrice = this.getArrBuy().get(0).getbuyprice();
    double sellPrice = this.getArrSell().get(0).getsellprice();

    if (buyPrice >= sellPrice) {
        int buyQuantity = this.getArrBuy().get(0).getquantity();
        int sellQuantity = this.getArrSell().get(0).getquantity();

        if (buyQuantity >= sellQuantity) {
            int tradeQuantity = sellQuantity;
            double tradePrice = sellPrice;

            System.out.println("Trade completed - deal price: $" + tradePrice + ", quantity: " + tradeQuantity);

            
            this.getArrBuy().get(0).setquantity(this.getArrBuy().get(0).getquantity() - tradeQuantity);
            if (this.getArrBuy().get(0).getquantity() == 0) {
                this.getArrBuy().remove(0);
            }

            this.getArrSell().get(0).setquantity(this.getArrSell().get(0).getquantity() - tradeQuantity);
            if (this.getArrSell().get(0).getquantity() == 0) {
                this.getArrSell().remove(0);
            }
        } else {
            int tradeQuantity = buyQuantity;
            double tradePrice = sellPrice;

            System.out.println("Trade completed - deal price: $" + tradePrice + ", quantity: " + tradeQuantity);

            
            this.getArrBuy().get(0).setquantity(this.getArrBuy().get(0).getquantity() - tradeQuantity);
            if (this.getArrBuy().get(0).getquantity() == 0) {
                this.getArrBuy().remove(0);
            }

            this.getArrSell().get(0).setquantity(this.getArrSell().get(0).getquantity() - tradeQuantity);
            if (this.getArrSell().get(0).getquantity() == 0) {
                this.getArrSell().remove(0);
            }
        }
    } else {
        System.out.println("No trades available.");
    }
}

public void addNtrade(buySide b1){
  this.buyS.add(b1);
  this.trade();

}

public void addNtrade(sellSide s1){
  this.sellS.add(s1);
  this.trade();
}

// trade update use for-loop finish all match order; not done yet

   
  

  public static void main(String[] args) {
    buySide b1=new buySide(1.0, 10);
    buySide b2=new buySide(2.0, 10);
    buySide b3=new buySide(1.5, 5);
    buySide b4=new buySide(1.3, 8);

    orderbook o1=new orderbook();
    o1.getArrBuy().add(b1);
    o1.getArrBuy().add(b2);
    o1.getArrBuy().add(b3);
    o1.getArrBuy().add(b4);

    //o1.sortBUYandSELL();

    //System.out.println(o1.getArrBuy());
    

    sellSide s1=new sellSide(2, 10);
    sellSide s2=new sellSide(1.5, 10);
    sellSide s3=new sellSide(1.8, 10);

    o1.getArrSell().add(s1);
    o1.getArrSell().add(s2);
    o1.getArrSell().add(s3);

    //o1.sortBUYandSELL();
    //System.out.println(o1.getArrSell());
    o1.addNtrade(new sellSide(1.2, 10));
    o1.addNtrade(new buySide(1.8, 10));

    //o1.trade();
    //o1.trade();
    

    

    

    
    
  }

  


  //assumption $1-$2, 0.05 1格
  // buy side,your price < market price
  //buy side, your price>market price
  //sell ,your price<market price
  //sell ,your price>market price
  //$10 3q (buy)
  //$11 2q(sell)

  // market price =last trade in the market;
  
}
