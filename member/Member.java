package member;

import java.util.List;

public class Member {
  private String name;
  private int age;
  private Gender gender;

  public Member(Memberbuilder mb1) {
    this.name=mb1.name;
    this.age=mb1.age;
    this.gender=mb1.gender;

  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public Gender getGender(){
    return this.gender;
  }
  public String toString(){
    return " name = "+this.name+" age = "+this.age+" gender = "+this.gender;
  }

  public static class Memberbuilder {
    private String name;
    private int age;
    private Gender gender;

    public Memberbuilder name(String name){
      this.name=name;
      return this;
    }
    public Memberbuilder age(int age){
      this.age=age;
      return this;
    }
    public Memberbuilder gender(Gender gender){
      this.gender=gender;
      return this;
    }
    public Member build(){
      return new Member(this);
    }


  }

  public static Member.Memberbuilder build(){
    return new Member.Memberbuilder();
  }

}
