package Trade;

import java.util.Comparator;

public class sortbyPriceSELL implements Comparator<sellSide>{
  @Override
  public int compare(sellSide s1, sellSide s2) {
    if (s1.getsellprice() < s2.getsellprice()) {
      return -1;
    }return 1;

  }

  
    
  }
  

