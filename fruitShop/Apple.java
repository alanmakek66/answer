package fruitShop;

interface Apple {
  double getPrice();

  public class ChinaApple implements Apple{
    private double price=4.5;
    private Origin origin=Origin.China;

    public double getPrice(){
      return this.price;
    }
  }
  public class JapanaApple implements Apple{
    private double price=6.5;
    private Origin origin=Origin.Japan;
  }
  public class USAApple implements Apple{
    private double price=5.0;
    private Origin origin=Origin.USA;
  }
  
}
