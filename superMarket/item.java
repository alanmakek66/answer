package superMarket;

public class item {

  private String itemName;
  private Double itemprice;

  public item(String itemName,double itemprice){
    this.itemName=itemName;
    this.itemprice=itemprice;

  }

  public String toString(){
    return "itemName = "+this.itemName+" itemprice = "+
    this.itemprice;
  }

  public static void main(String[] args) {
    item item1=new item("beer", 10.5);
    item item2=new item("apple", 3.3);
    item item3=new item("water",2.5);
    /* item[] list1=new item[3];
    list1[0]=item1;
    list1[1]=item2;
    list1[2]=item3; */

    
    branch b1=new branch("lamtin01");
    b1.add(item1);
    b1.add(item2);
    b1.add(item3);
    System.out.println(b1);
    branch b2=new branch("mongkok01");
    
    superMarket s1= new superMarket("wellcome");
    s1.add(b1);
    s1.add(b2);
    System.out.println(s1);
  }
  
}
