package Trade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// $1 - $2, no ordering

// Map advantage: hash -> search by key ($1.5 -> 4000)

public class orderbook2 {

  private double lastMarketprice;

  private Map<Double, Integer> entries;

  private ArrayList<buySide> buyS;

  private ArrayList<sellSide> sellS;

  // private double range;

  public orderbook2(double range) {
    this.entries = new HashMap<>();
    this.buyS = new ArrayList<>();
    this.sellS = new ArrayList<>();
    BigDecimal increment = BigDecimal.valueOf(range);
    BigDecimal upperBound = BigDecimal.valueOf(2);

    for (BigDecimal i = BigDecimal.ONE; i.compareTo(upperBound) <= 0; i = i.add(increment)) {
      this.entries.put(i.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(), 0);
    }
  }

  public Map<Double, Integer> getMap() {
    return this.entries;
  }

  public void updateOrderBK() {
    for (int i = 0; i < this.getArrSell().size(); i++) {
      this.entries.put(this.getArrSell().get(i).getsellprice(), this.getArrSell().get(i).getquantity());
    }

  }

  // prsent -value = buyer want stock, +value = have stock in market;
  public void buysideAddNtrade() {
    this.updateOrderBK();
    for (int i = 0; i < this.getArrBuy().size(); i++) {
      this.getMap().put(this.getArrBuy().get(i).getbuyprice(),this.entries.get(this.getArrBuy().get(i).getbuyprice()) 
      -this.getArrBuy().get(i)
      .getquantity());

      int value=Math.abs(this.getMap().get(this.getArrBuy().get(i).getbuyprice()));

      if(value!=this.getMap().get(this.getArrBuy().get(i).getbuyprice())){
        this.lastMarketprice=this.getArrBuy().get(i).getbuyprice();
      }

    }
}

  /* this.getArrBuy().get(i)
      .getquantity()-this.entries.get(this.getArrBuy().get(i).getbuyprice())  */

  public ArrayList<buySide> getArrBuy() {
    return this.buyS;
  }

  public ArrayList<sellSide> getArrSell() {
    return this.sellS;
  }

  public double getlastMarketprice(){
    return this.lastMarketprice;
    
  }

  @Override
  public String toString() {
    return "order book = " + this.entries; // last price
  }

  public static void main(String[] args) {
    orderbook2 o2 = new orderbook2(0.05);
    // System.out.println(o2);

    sellSide s1 = new sellSide(1.1, 500);
    sellSide s2 = new sellSide(1.5, 400);
    sellSide s3 = new sellSide(1.2, 50);
    o2.getArrSell().add(s1);
    o2.getArrSell().add(s2);
    o2.getArrSell().add(s3);
    o2.updateOrderBK();

    o2.getArrBuy().add(new buySide(1.2, 100));
    o2.getArrBuy().add(new buySide(1.8, 1000));
    
    o2.buysideAddNtrade();

    System.out.println(o2);
    System.out.println(o2.lastMarketprice);

  }

}
