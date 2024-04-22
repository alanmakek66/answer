package weapon;

public class knife implements weapon {

  private double price;
  private double weight;

  public knife(double price,double weight){
    this.price=price;
    this.weight=weight;

  }

  public void attact(){
    System.out.println("Use knife to attact");
  }

  public void throww(){
    System.out.println("throw the knife");
  }

  public static void main(String[] args) {
    soldier s2=new soldier("ken");
    
  }
  
}
