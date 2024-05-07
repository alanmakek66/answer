package clothes;

interface Cap {

  int getPrice();

  brand getBrand();

  int getquantity();

  public class NIKECap implements Cap {
    private final int price = 240;
    private final brand brand1 = brand.NIKE;
    private final int quantity = 300;

    @Override
    public int getPrice() {
      return this.price;

    }

    @Override
    public int getquantity() {
      return this.quantity;

    }

    @Override
    public brand getBrand() {
      return this.brand1;

    }

  }
  public class ADIDASCap implements Cap{
    private final int price = 280;
    private final brand brand1 = brand.ADIDAS;
    private final int quantity = 280;
    @Override
    public int getPrice() {
      return this.price;

    }

    @Override
    public int getquantity() {
      return this.quantity;

    }

    @Override
    public brand getBrand() {
      return this.brand1;

    }

  }
  public class PUMACap implements Cap{
    private final int price = 220;
    private final brand brand1 = brand.PUMA;
    private final int quantity = 220;
    @Override
    public int getPrice() {
      return this.price;

    }

    @Override
    public int getquantity() {
      return this.quantity;

    }

    @Override
    public brand getBrand() {
      return this.brand1;

    }

  }

}
