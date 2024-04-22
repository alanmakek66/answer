package dice;

public enum food {
  RICE(1),
  BEEF(2),
  CHICKEN(3),
  ;

  private int value;

  private food(int vlaue){
    this.value=value;
}

public int getValue(){
  return this.value;
}

public String toString(){
  return "value = "+this.value;
}

}
