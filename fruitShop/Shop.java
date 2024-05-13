package fruitShop;

interface Shop {
  Apple sellApple();
  Banana sellBanana();

  public class ChinaCategory implements Shop{
    public Apple sellApple(){
      return new Apple.ChinaApple();
    }

    public Banana sellBanana(){
      return new Banana.ChinaBanana();
    }


  }

  public static void main(String[] args) {
    Shop s1=new Shop.ChinaCategory();
    //s1.sellApple().getPrice();
    Apple a1=s1.sellApple();
    System.out.println(a1.getPrice());
    System.out.println(a1.getOrigin());
    
    
    
  }
  
}
