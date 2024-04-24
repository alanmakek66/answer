package Trade;

import java.util.Comparator;

public class sortbyPriceBUY implements Comparator<buySide> {
  @Override
  public int compare(buySide b1, buySide b2) {
    if (b1.getbuyprice() > b2.getbuyprice()) {
      return -1;
    }return 1;

  }
}
