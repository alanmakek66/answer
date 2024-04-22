package dice;

public class result {

  private color color1;
  private food food1;

  public void setColor(color color1){
    this.color1=color1;
  }

  public void setFood(food food1){
    this.food1=food1;
  }

  public int score() {
    return food1.getValue() + color1.getValue();
  }

  public String toString(){
    return "color:"+this.color1+
    "food:"+this.food1;
  }
  
}
