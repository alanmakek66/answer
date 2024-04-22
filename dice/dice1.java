package dice;

import java.util.Arrays;
import java.util.Random;

public class dice1 implements roll {
  private final color[] colors = { color.BLACK, color.BLUE, color.RED, color.WHITE, color.YELLOW };

  public color[] getColor() {
    return this.colors;
  }

  @Override
  public int roll() {

    int idx = new Random().nextInt(5);
    return colors[idx].getValue();

  }

  public color roll2() {
    int idx = new Random().nextInt(5); // 0-4
    return colors[idx];
  }

  public String toString() {
    return "colors = " + Arrays.toString(this.colors);
  }

}
