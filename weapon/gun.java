package weapon;

import java.util.Objects;

public class gun implements weapon {

  private double price;
  private double weight;

  public gun(double price,double weight){
    this.price=price;
    this.weight=weight;

  }

  public void attact(){
    System.out.println("Use gun to attact");
  }

  public void throww(){
    System.out.println("throw the gun");
  }
  @Override

  public boolean equals(Object obj){
    if(this==obj){
      return true;
    }
    if (!(obj instanceof gun)){
      return false;
    }
    gun g1=(gun) obj;
    return Objects.equals(this.price, g1.price)&&
    Objects.equals(this.weight, g1.weight);


  }
  @Override
  public int hashCode(){
    return Objects.hash(this.price,this.weight);
  }

  public static void main(String[] args) {
    gun g1=new gun(123.1, 2321.1);
    System.out.println(g1.hashCode());
  }



  
}
