package fruitShop;

interface Banana {
  double getPrice();

  Origin getOrigin();

  public class ChinaBanana implements Banana{
    private double price=6;
    private Origin origin=Origin.China;
    @Override

    public double getPrice() {
      return this.price;
    }

    @Override
    public Origin getOrigin() {
      return this.origin;
    }
  }
  public class USABanana implements Banana{
    private double price=7.0;
    private Origin origin=Origin.USA;
    @Override

    public double getPrice() {
      return this.price;
    }

    @Override
    public Origin getOrigin() {
      return this.origin;
    }
  }
  public class JapanBanana implements Banana{
    private double price=8.8;
    private Origin origin=Origin.Japan;
    @Override

    public double getPrice() {
      return this.price;
    }

    @Override
    public Origin getOrigin() {
      return this.origin;
    }
  }

  
  
}
