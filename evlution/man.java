package evlution;

import java.util.HashMap;
import java.util.Map;

public abstract class man {
  private String name;
  private double weight;

  public man(String name,double weight){
    this.name=name;
    this.weight=weight;
  }
  
  public void eat(){
    System.out.println("I am eating");
  }

  public abstract void superpower();

  public static void main(String[] args) {
    //man m1=new man();
    man m1=new superman(null, 0);
    //m1.fly();
    //Map m1=new HashMap<>()
    
  }

  
}