package person;

public class human {
  private double weight;
  private double height;

  public static class humanbuilder{
    private double weight;
  private double height;
  public humanbuilder setweight(double weight){
    this.weight=weight;
    return this;
    
  }
  public humanbuilder setheight(double height){
    this.height=height;
    return this;
    
  }
    
  }
  
}
