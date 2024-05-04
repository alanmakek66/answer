package salary;

import java.util.Optional;

public class staff {
  private String name;
  private double salary;

  public staff(String name,double salary){
    this.name=name;
    this.salary=salary;
  }
  public String getName(){
    return this.name;
  }
  public double getSalary(){
    return this.salary;
  }
  public String toString(){
    return " name = "+this.name+" salary = "+this.salary;
  }
  public Optional<String> check(){
    if(this.getName().length()>6){
      return Optional.of(this.getName());
    }return Optional.empty();

  }

  public static void main(String[] args) {
    staff s1=new staff("kenny", 18000);
    System.out.println(s1.check());

  }
  
}
