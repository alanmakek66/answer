package Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class staff {
  private String name;
  private department dp;
  private double salary;

  public staff(staffbuilder sb1){
    this.name=sb1.name;
    this.dp=sb1.dp;
    this.salary=sb1.salary;
  }

  public double getSalary() {
    return this.salary;
  }
  public department getDp() {
    return this.dp;
  }


  public String getName() {
    return this.name;
  }

  @Override
  public String toString(){
    return " name = "+this.name+" department = "+this.dp+" salary = "+this.salary;
  }

  public static class staffbuilder {
    private String name;
    private department dp;
    private double salary;

    public staffbuilder name(String name){
      this.name=name;
      return this;
    }
    public staffbuilder department(department dp){
      this.dp=dp;
      return this;
    }
    public staffbuilder salary(double salary){
      this.salary=salary;
      return this;
    }
    public staff build(){
      return new staff(this);
    }

  }

  public static void main(String[] args) {
    staff s1=staff.build()
    .name("sam")
    .department(department.Finance)
    .salary(8000.0)
    .build();
    staff s2=staff.build()
    .name("ken")
    .department(department.HR)
    .salary(9000.0)
    .build();
    staff s3=staff.build()
    .name("ken")
    .department(department.HR)
    .salary(10000.0)
    .build();
    staff s4=staff.build()
    .name("ken")
    .department(department.IT)
    .salary(10000.0)
    .build();
    
    List<staff> s1List= new ArrayList<>(List.of(s1,s2,s3,s4));
    List<staff> morethan9000=s1List.stream()
    .filter(e->e.getSalary()>=9000).collect(Collectors.toList());
    Map<department,String> samedp= s1List.stream()
    .collect(Collectors.groupingBy(e->e.getDp(),Collectors.mapping(e->e.getName(),Collectors.joining(", "))));

    System.out.println(samedp);




    
  }

  public static staff.staffbuilder build(){
    return new staff.staffbuilder();
  }

  

}


