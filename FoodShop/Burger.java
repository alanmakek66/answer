package FoodShop;

interface Burger {
   double getPrice();

   public class CheapBurger implements Burger{
    private final double price= 23.8;
    @Override
    public double getPrice(){
      return this.price;
    }

   }

   public class ExpensiveBurger implements Burger{
    private final double price= 88.8;
    @Override
    public double getPrice(){
      return this.price;
    }

   }
  
}
