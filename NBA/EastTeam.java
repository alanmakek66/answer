package NBA;

public enum EastTeam {
  BOSTONCELTICS(0.78),
  MILWAUKEEBUCKS(0.598),
  NEWYORKKNICKS(0.61),
  CLEVELAND(0.585),
  MAGIC(0.573),
  PACERS(0.573),
  P76ers(0.57),
  HEATS(0.561),
  BULLS(0.476),
  HAWKS(0.439),
  NETS(0.39),
  RAPTORS(0.305),
  HORNETS(0.256),
  WIZARDS(0.183),
  PISTIONS(0.178),
  ;
private double winrate;

private EastTeam(double winrate){
  this.winrate=winrate;
}
public double getwinrate(){
  return this.winrate;
}


  



  
}
