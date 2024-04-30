package NBA;

import java.util.Comparator;

public class sortbyWinrate   implements Comparator<EastTeam>  {
  @Override
  public int compare(EastTeam e1,EastTeam e2){
    if(e1.getwinrate()>e2.getwinrate()){
      return -1;
    }return 1;
  }
  
}
