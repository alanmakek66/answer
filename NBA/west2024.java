package NBA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class west2024 extends reuglarTable {
  private List<WestTeam> wt;
  
  public west2024(){
    this.wt=new ArrayList<>(List.of(WestTeam.CLIPPERS,WestTeam.DALLAS,WestTeam.JAZZ,WestTeam.KINGS
    ,WestTeam.LAKERS,WestTeam.MEMPHIS,WestTeam.NUGGEESTS,WestTeam.OCT,WestTeam.PELICANS
    ,WestTeam.PORTLAND,WestTeam.ROCKETS,WestTeam.SPURS,WestTeam.SUNS,WestTeam.WARRIORS,WestTeam.WOLVES));
  }
  @Override
  public void champion(){
    System.out.println(this.getchampion());
  }
  
  @Override
  public void theLastPlace(){
    System.out.println(this.getWestTeam().get(this.getWestTeam().size()-1));

  }
  public List<WestTeam> getWestTeam(){
    return this.wt;
  }
  public WestTeam getchampion(){
    Collections.sort(this.getWestTeam(), new sortbyWinrate2());
    return this.getWestTeam().get(0);

  }
  @Override
  public List<WestTeam> getplayoffList(){
    List<WestTeam> ww1=new ArrayList<>();

    for(int i=0;i<10;i++){
      ww1.add(this.getWestTeam().get(i));

    }return ww1;

  }


 




  

  
}
