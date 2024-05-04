package Ball;

public class Ball {
  private Color colors;
  private double weight;
  private int quantity;

  public Ball(Ballbuilder b1){
    this.colors=b1.colors;
    this.quantity=b1.quantity;
    this.weight=b1.weight;
  }
  public static Ball.Ballbuilder build(){
    return new Ball.Ballbuilder();
  }



  public static class Ballbuilder{
    private Color colors;
  private double weight;
  private int quantity;

  public Ballbuilder setColor(Color colors){
    this.colors=colors;
    return this;
  }
  public Ballbuilder setWeight(double weight){
    this.weight=weight;
    return this;
  }
  
  public Ballbuilder setquantity(int quantity){
    this.quantity=quantity;
    return this;
  }
  public Ball build(){
    return new Ball(this);
  }

  }

  public static void main(String[] args) {
    Ball b1=Ball.build()
    .setColor(Color.BLACK)
    .setWeight(4.5)
    .setquantity(30)
    .build();
  }
  
}
