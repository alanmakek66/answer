package NBA;

import java.util.Comparator;

public class sortbyWinrate2 implements Comparator<WestTeam> {
  @Override
  public int compare(WestTeam w1,WestTeam w2) throws IllegalArgumentException{

    if(w1.getwinrate()>w2.getwinrate()){
      return -1;
    }return 1;
  }
  
}
