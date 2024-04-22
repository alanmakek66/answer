package dice;

public enum color {
  RED(1),
  BLACK(2),
  YELLOW(3),
  BLUE(4),
  WHITE(5),
  ;

  private int value;

  private color(int value){
    this.value=value;
  }

  public int getValue(){
    return this.value;
  }

  public String toString(){
    return "value = "+this.value;
  }
  
}
