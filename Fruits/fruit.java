package Fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class fruit {
  private String desc;
  private double price;
  private int quantity;

  private fruit(fruitbuilder f1){
    this.desc=f1.desc;
    this.price=f1.price;
    this.quantity=f1.quantity;
  }

  public String getdesc() {
    return this.desc;
  }

  public double getPrice() {
    return this.price;
  }

  public int getqunity() {
    return this.quantity;
  }
  @Override
  public String toString(){
return " desc = "+this.desc+" price = "+this.price
+" quantity"+this.quantity;
  }

  public static class fruitbuilder {
    private String desc;
    private double price;
    private int quantity;

    public fruitbuilder setdesc(String desc) {
      this.desc = desc;
      return this;

    }

    public fruitbuilder setprice(double price) {
      this.price = price;
      return this;

    }

    public fruitbuilder setquanity(int quantity) {
      this.quantity = quantity;
      return this;

    }

    public fruit build() {
      return new fruit(this);
    }

  }

  public static void main(String[] args) {
    fruit ff1=new fruit.fruitbuilder()
    .setdesc("apple").setprice(3.5).setquanity(30).build();
    fruit ff2=new fruit.fruitbuilder()
    .setdesc("banana").setprice(5.5).setquanity(20).build();
    fruit ff3=new fruit.fruitbuilder()
    .setdesc("orange").setprice(4.5).setquanity(25).build();

    List<fruit> list1=new ArrayList<>(List.of(ff1,ff2,ff3));
    //System.out.println(list1);
    

    List<Double>new1=list1.stream().flatMap(e->Arrays.asList(e.getPrice()).stream())
    .filter(e->e>=4.5).collect(Collectors.toList());
    List<Double>new2=list1.stream().map(e->e.getPrice()).filter(e->e>=4.5)
    .collect(Collectors.toList());

    /* System.out.println(new1);
    System.out.println(list1); */
    System.out.println(new2);

    Map<String,Double> new4=list1.stream()
    .collect(Collectors.groupingBy(e->e.getdesc(),Collectors.summingDouble(e->e.getPrice()*e.getqunity())))
    ;
    System.out.println(new4);

    List<Integer> test=new ArrayList<>(List.of(1,3,5,6));

    List<List<fruit>> test1=new ArrayList<>(List.of(list1));


    List<fruit> ttt=test1.stream().flatMap(e->e.stream()).collect(Collectors.toList());
    System.out.println(ttt);
    
     //int nn=test.stream().collect(Collectors.groupingBy(e->e,Collectors.summingInt(e->e)));

     //must be map type
    
    






  }

}
