package factory2;

interface Phone {
  double getPrice();
  Style getStyle();

  public class CheapPhone implements Phone{
    private final Style style=Style.Cheap;
    private double price=3000.0;

    @Override
    public double getPrice(){
      return this.price;
    }
    @Override
    public Style getStyle(){
      return this.style;
    }
  }
  public class ExpensivePhone implements Phone{
    private final Style style=Style.Expensive;
    private double price=8800.0;

    @Override
    public double getPrice(){
      return this.price;
    }
    @Override
    public Style getStyle(){
      return this.style;
    }
  }
  
}
