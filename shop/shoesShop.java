package shop;

import java.util.HashMap;
import java.util.Map;

public class shoesShop {
  private String name;
  private Map<item, Double> items;

  public shoesShop(String name){
    this.name=name;
    this.items=new HashMap<>();
  }

  public Map<item, Double> getMap(){
    return this.items;
  }

  public String getName(){
    return this.name;
  }
@Override
  public String toString(){
    return " shop name = "+this.name+" there are "+this.items;
  }

  public Map<item, Double> checkBug() throws IllegalArgumentException{
    for(Map.Entry<item,Double> test1:this.getMap().entrySet()){
      if(test1.getValue()<=0||test1.getValue()==null){
        throw new IllegalArgumentException();
        //this.getMap().remove(test1.entrySet());
      }
    } return this.getMap();
  }

  public Map<item, Double> showAllproduce(){
    try{
      this.checkBug();
    }catch(IllegalArgumentException e){
      for(Map.Entry<item, Double> entry: this.getMap().entrySet()){
        if(entry.getValue() <= 0||entry.getValue()==null){
          this.getMap().remove(entry.getKey());}

    }
  }return this.getMap();
    
    
  }
  
  public static void main(String[] args) {
    shoesShop s1=new shoesShop("nice shop");
    s1.getMap().put(item.basketballShoes, 550.5);
    s1.getMap().put(item.footballBoot, 600.5);
    s1.getMap().put(item.highHeel, -6.0);
    s1.getMap().put(item.slipper, 0.5);

    s1.showAllproduce();
  }
  
}
