package weapon;

import java.util.ArrayList;

public class soldier {

  private String name;
  private ArrayList<gun> gunList;
  private ArrayList<knife> knifeList;

  public soldier(String name){
    this.name=name;
    this.gunList=new ArrayList<>();
    this.knifeList=new ArrayList<>();

  }

  public ArrayList<gun> getGunList(){
    return this.gunList;
  }


  public static void main(String[] args) {
   soldier s1=new soldier("Sam");
   s1.gunList.add(new gun(100.0, 32.3));
   System.out.println(s1);
    
  }

  
}
