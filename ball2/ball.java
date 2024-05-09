package ball2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ball {
  private double weight;
  private int quanity;
  private Color color;
  private Style style;

  public ball(ballbuilder b1){
    this.weight=b1.weight;
    this.quanity=b1.quanity;
    this.color=b1.color;
    this.style=b1.style;
  }
  public double getWeight(){
    return this.weight;
  }
  public int getQuanity(){
    return this.quanity;
  }

  public Color getColor(){
    return this.color;
  }
  public Style getStyle(){
    return this.style;
  }
  @Override
  public String toString(){
    return "weight = "+this.weight+" quanity = "+this.quanity+" Color = "+this.color+
    " Style = "+this.style;
  }

  public static class ballbuilder{
    private double weight;
  private int quanity;
  private Color color;
  private Style style;

  public ballbuilder weight(double weight){
    this.weight=weight;
    return this;
  }
  public ballbuilder quanity(int quanity){
    this.quanity=quanity;
    return this;
  }
  public ballbuilder Color(Color color){
    this.color=color;
    return this;
  }
  public ballbuilder Style(Style style){
    this.style=style;
    return this;
  }
  public ball build(){
    return new ball(this);
  }
  


  }

  public static void main(String[] args) {
    ball b1=new ball.ballbuilder()
    .weight(20.5)
    .quanity(50)
    .Color(Color.BLACK)
    .Style(Style.football)
    .build();
    ball b2=new ball.ballbuilder()
    .weight(15)
    .quanity(20)
    .Color(Color.RED)
    .Style(Style.basketball)
    .build();
    ball b3=new ball.ballbuilder()
    .weight(150)
    .quanity(210)
    .Color(Color.WHITE)
    .Style(Style.basketball)
    .build();
    ball b4=new ball.ballbuilder()
    .weight(1500)
    .quanity(2100)
    .Color(Color.BLACK)
    .Style(Style.teenis)
    .build();
    
    List<ball> bList=new ArrayList<>(List.of(b1,b2,b3,b4));
    Optional<List<ball>> obList=Optional.of(bList);
    //System.out.println(obList);
    Optional<List<ball>> obList2=Optional.ofNullable(bList);
    //System.out.println(obList2);
    
    Map<Color,Integer> m1=
    bList.stream().collect(Collectors.groupingBy(e->e.getColor(),Collectors.summingInt(e->e.getQuanity())));

System.out.println(m1);


  }
  
}
