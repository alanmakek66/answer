package clothes;

interface Pants {
  int getPrice();

  brand getBrand();

  int getquantity();

  public class ADIDASPants implements Pants{
    private final int price = 500;
    private final brand brand1 = brand.ADIDAS;
    private final int quantity = 400;
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

  public class NIKEPants implements Pants{
    private final int price = 480;
    private final brand brand1 = brand.NIKE;
    private final int quantity = 400;
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

  public class PUMAPants implements Pants{
    private final int price = 455;
    private final brand brand1 = brand.PUMA;
    private final int quantity = 380;
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
