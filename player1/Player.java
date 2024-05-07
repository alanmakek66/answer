package player1;

public class Player {
  private String name;
  private int age;
  private Country country;
  private Gender gender;
  public Player(Playerbuilder p1){
    this.name=p1.name;
    this.age=p1.age;
    this.gender=p1.gender;
    this.country=p1.country;
  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public Country getCountry(){
    return this.country;
  }
  public Gender getGender(){
    return this.gender;
  }
  public String toString(){
    return "Name = "+this.name+" Age = "+this.age
    +" Country = "+this.country+" Gender = "+this.gender;
  }

  public static class Playerbuilder{
    private String name;
  private int age;
  private Country country;
  private Gender gender;
  
  public Playerbuilder name(String name){
    this.name=name;
    return this;
  }
  public Playerbuilder age(int age){
    this.age=age;
    return this;
  }
  public Playerbuilder country(Country country){
    this.country=country;
    return this;
  }
  public Playerbuilder gender(Gender gender){
    this.gender=gender;
    return this;
  }

  public Player build(){
    return new Player(this);
  }

  }
  public static Player.Playerbuilder build(){
    return new Player.Playerbuilder();
  }
  
}
