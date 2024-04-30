package machine;

public class car<T extends Number> implements machine  {
  private String name;
  private T price;
  @Override
  public void start(){
    System.out.println("turn on ");

  }
  @Override
  public void off(){
    System.out.println(" turn off");
  }
  public double getprice(){
    return this.price.doubleValue();
  }

  public car(String name, T price){
    this.name=name;
    this.price=price;
  }
  
}
