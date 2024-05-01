package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class shop {
  private String name;
  private List<item> itemlist;

  public shop(String name) {
    this.name = name;
    this.itemlist = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public List<item> getitemList() {
    return this.itemlist;
  }

  public List<item> getHighPriceitem() {
    List<item> newlists = this.getitemList().stream()
        .filter(e -> e.getPrice() > 500).collect(Collectors.toList());
    return newlists;
  }

  public Optional<List<item>> gethighquantityitems() {

    List<item> new1 = this.getitemList().stream().filter(e -> e.getQuantity() > 100)
        .collect(Collectors.toList());
    return Optional.ofNullable(new1); // 非常好用
  }

  /*
   * .findAny()
   * .orElse(null)));
   */
  public Optional<item> getHigher10000item1() {
    for (int i = 0; i < this.getitemList().size(); i++) {
      if (this.getitemList().get(i).getPrice() > 10000) {
        return Optional.of(this.getitemList().get(i));
      }
    }
    return Optional.empty();
  }

  public Optional<List<item>> getHigher10000item2() {
    List<item> new1 = this.getitemList().stream().filter(e -> e.getPrice() > 10000)
        .collect(Collectors.toList());
    return Optional.ofNullable(new1);
  }

  public Optional<List<item>> getNegativeitem() throws IllegalArgumentException {
    item new1 = this.getitemList().stream().filter(e -> e.getPrice() < 0)
        .findFirst().orElseThrow(() -> new IllegalArgumentException());
    List<item> newlist = new ArrayList<>(List.of(new1));
    //newlist.add(new1);

    return Optional.ofNullable(newlist);

  }

  public String toString() {
    return " name = " + this.name + "itme list = " + this.itemlist;
  }

  public static void main(String[] args) {
    shop s1 = new shop("nice shop");
    s1.getitemList().add(new item("iphone", 8900.0, 200));
    s1.getitemList().add(new item("apple", 5.5, 50));
    s1.getitemList().add(new item("shoes", 800, 250));
    s1.getitemList().add(new item("pc", 1500.0, 50));
    System.out.println(s1.gethighquantityitems());

    System.out.println(s1.getHigher10000item1());
    System.out.println(s1.getHigher10000item2());
    try{
      s1.getNegativeitem();
    }catch(IllegalArgumentException e){
      System.out.println("no negative item");
    }

    /*
     * List<Integer>i1=new ArrayList<>(List.of(1,2,3));
     * List<Integer> i2=i1.stream().filter(e->e>2).collect(Collectors.toList());
     * System.out.println(i2);
     */

  }

}
