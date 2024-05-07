package Player;

public class Player {
  private String name;
  private Country country;
  private Gender gender;
  private int age;

  public Player(Playerbuilder p1){
    this.name=p1.name;
    this.gender=p1.gender;
    this.country=p1.country;
    this.age=p1.age;
  }

  public String getName(){
    return this.name;
  }
  public Country getCountry(){
    return this.country;
  }
  public Gender getGender(){
    return this.gender;
  }
  public int getAge(){
    return this.age;
  }
  @Override
  public String toString(){
    return "NAME = "+this.name+" Country = "+this.country
    +" Gender = "+this.gender+" Age = "+this.age;
  }



  public static Player.Playerbuilder build(){
    return new Player.Playerbuilder();
  }

  public static class Playerbuilder {
    private String name;
  private Country country;
  private Gender gender;
  private int age;
  public Playerbuilder name(String name){
    this.name=name;
    return this;
  }
  public Playerbuilder Gender(Gender gender){
    this.gender=gender;
    return this;
  }
  public Playerbuilder Country(Country country){
    this.country=country;
    return this;
  }
  public Playerbuilder age(int age){
    this.age=age;
    return this;
  }
  public Player build(){
    return new Player(this);
  }


  }
  
}
