package dice;

import java.util.Arrays;
import java.util.Random;

public class dice2 implements roll {
  private final food[] foods = { food.BEEF, food.CHICKEN, food.RICE };

  public food[] getFood() {
    return this.foods;
  }

  @Override
  public int roll() {
    int idx = new Random().nextInt(3);
    return foods[idx].getValue();

  }

  public food roll2() {
    int idx = new Random().nextInt(3); // 0-4
    return foods[idx];
  }

  public String toString(){
    return "foods = "+Arrays.toString(this.foods);
  }

}
