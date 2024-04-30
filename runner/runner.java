package runner;

public class runner {

  private String name;
  private double speed;

  public runner(String name,double speed) throws IllegalArgumentException {
    /* if(name==null||speed<=0){
      throw new IllegalArgumentException();
    } */
    this.name=name;
    this.speed=speed;
    
  }
  public String getName(){
    return this.name;
  }
  public double getSpeed(){
    return this.speed;
  }
  @Override
  public String toString(){
    return " runner name = "+this.name+" speed = "+this.speed;
  }
  
}
