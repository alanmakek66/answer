package clothes;

interface Tee {
  int getPrice();

  brand getBrand();

  int getquantity();

  public class UniqloTee implements Tee {
    private final int price = 199;
    private final brand brand1 = brand.Uniqlo;
    private final int quantity = 500;

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
  public class GUTee implements Tee{
    private final int price=180;
    private final brand brand1=brand.GU;
    private final int quantity=420;
    @Override 
    public int getPrice(){
      return this.price;

    }
    @Override 
    public int getquantity(){
      return this.quantity;

    }
    @Override 
    public brand getBrand(){
      return this.brand1;

    }

}

public class NIKETee implements Tee{
  private final int price=299;
  private final brand brand1=brand.NIKE;
  private final int quantity=1200;
  @Override 
  public int getPrice(){
    return this.price;

  }
  @Override 
  public int getquantity(){
    return this.quantity;

  }
  @Override 
  public brand getBrand(){
    return this.brand1;

  }

}

public class ADIDASTee implements Tee{
  private final int price=288;
  private final brand brand1=brand.ADIDAS;
  private final int quantity=1000;
  @Override 
  public int getPrice(){
    return this.price;

  }
  @Override 
  public int getquantity(){
    return this.quantity;

  }
  @Override 
  public brand getBrand(){
    return this.brand1;

  }

}

public class PUMATee implements Tee{
  private final int price=250;
  private final brand brand1=brand.PUMA;
  private final int quantity=800;
  @Override 
  public int getPrice(){
    return this.price;

  }
  @Override 
  public int getquantity(){
    return this.quantity;

  }
  @Override 
  public brand getBrand(){
    return this.brand1;

  }

}

}
