package FoodShop;

import FoodShop.Burger.CheapBurger;
import FoodShop.Burger.ExpensiveBurger;

interface Shop {
  Burger sellBurger();

  public class Cheapshop implements Shop{
    @Override
    public Burger sellBurger(){
      return new CheapBurger();
    }

  }

  public class ExpensiveBurgershop implements Shop{
    @Override
    public Burger sellBurger(){
      return new ExpensiveBurger();
    }

  }

  public static Shop create(Style s1) throws Exception{
    switch (s1) {
      case Cheap:
      return new Cheapshop();
      case Expensive:
      return new ExpensiveBurgershop();

    }
    throw new Exception();
  }
  
}
