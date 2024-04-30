package NBA;

public enum WestTeam {
  OCT(0.695),
  NUGGEESTS(0.695),
  WOLVES(0.683),
  CLIPPERS(0.622),
  DALLAS(0.61),
  SUNS(0.598),
  PELICANS(0.598),
  LAKERS(0.573),
  KINGS(0.561),
  WARRIORS(0.561),
  ROCKETS(0.5),
  JAZZ(0.378),
  MEMPHIS(0.329),
  SPURS(0.268),
  PORTLAND(0.25),
  ;
  private double winrate;
  private WestTeam(double winrate){
    this.winrate=winrate;
  }
  public double getwinrate(){
    return this.winrate;
  }
  
  
}
