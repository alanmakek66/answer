package NBA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class east2024 extends reuglarTable  {
  private List<EastTeam> et;

  public east2024(){
    this.et=new ArrayList<>(List.of(EastTeam.BOSTONCELTICS,EastTeam.BULLS,EastTeam.CLEVELAND,
    EastTeam.HAWKS,EastTeam.HEATS,EastTeam.HORNETS,EastTeam.MAGIC,EastTeam.MILWAUKEEBUCKS,
    EastTeam.NETS,EastTeam.NEWYORKKNICKS,EastTeam.P76ers,EastTeam.PISTIONS,EastTeam.RAPTORS,EastTeam.WIZARDS));
  }
  public List<EastTeam> getTeam(){
    return this.et;
  }

  public void champion(){
    this.rank();
    System.out.println(this.getTeam().get(0));

  }
  public void theLastPlace(){
    this.rank();
    System.out.println(this.getTeam().get(this.getTeam().size()-1));

  }

  
 

  public EastTeam getChampion(){
    return this.getTeam().get(0);
  }

  public List<EastTeam> getplayoffList(){ 
    List<EastTeam> ee1=new ArrayList<>();
    for(int i=0;i<10;i++){
      ee1.add(this.getTeam().get(0));
 } return ee1;
    
  }
  public List<EastTeam> checkList() throws IllegalArgumentException{
    for(int i=0;i<this.getTeam().size();i++){
      if(this.getTeam().get(i).getwinrate()<0||this.getTeam().get(i).getwinrate()>1){
        throw new IllegalArgumentException();
      }
}return this.getTeam();

}

    

  
  public void rank(){
    Collections.sort(this.et, new sortbyWinrate());
  }
  @Override
  public String toString(){
    return "the ranking of east2024 = "+this.et;
  }

  public static void main(String[] args) {
    east2024 e1=new east2024();
    System.out.println(e1.getTeam().size());
    e1.rank();
    System.out.println(e1.getTeam());
    System.out.println(e1.getplayoffList());
    
  }

  

  
  

  
}
