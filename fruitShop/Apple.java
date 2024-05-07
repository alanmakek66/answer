package fruitShop;

interface Apple {
  double getPrice();

  Origin getOrigin();

  public class ChinaApple implements Apple {
    private double price = 4.5;
    private Origin origin = Origin.China;

    @Override
    public double getPrice() {
      return this.price;
    }

    @Override
    public Origin getOrigin() {
      return this.origin;
    }
  }

  public class JapanaApple implements Apple {
    private double price = 6.5;
    private Origin origin = Origin.Japan;

    @Override

    public double getPrice() {
      return this.price;
    }

    @Override
    public Origin getOrigin() {
      return this.origin;
    }

  }

  public class USAApple implements Apple {
    private double price = 5.0;
    private Origin origin = Origin.USA;

    @Override
    public double getPrice() {
      return this.price;
    }
    @Override
    public Origin getOrigin(){
      return this.origin;
    }
  }

}
