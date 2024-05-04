package salary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class company {
  private String companyName;
  private List<staff> staffList;

  public company(String companyname){
    this.companyName=companyname;
    this.staffList=new ArrayList<>();
  }
  
  public String getcompanyName(){
    return this.companyName;
  }
  public List<staff> getStaffList(){
    return this.staffList;
  }

  public Optional<List<staff>> getListofupperthan15000() throws IllegalArgumentException{
    staff s1=this.getStaffList().stream().filter(e->e.getSalary()>=15000).findFirst()
    .orElseThrow(()->new IllegalArgumentException());
     List<staff> news1=new ArrayList<>(List.of(s1));
     return Optional.of(news1);

  }

  public Optional<List<staff>> getListofupperthan20000() throws IllegalArgumentException{
    List<staff> s1=this.getStaffList().stream().filter(e->e.getSalary()>=20001)
    .collect(Collectors.toList());
    
    return Optional.ofNullable(s1);

  }

  public Optional<List<staff>> getListofupperthan14000(){
    List<staff> s1=this.getStaffList().stream()
    .filter(e->e.getSalary()>=14000).collect(Collectors.toList());
    return Optional.ofNullable(s1);
  }

  public Optional<List<staff>> getListofupperthan25500(){
    List<staff> s1=this.getStaffList().stream()
    .filter(e->e.getSalary()>=25500).collect(Collectors.toList());
    if(Optional.ofNullable(s1).isPresent()){
      return Optional.ofNullable(s1); //null is present able 跟 empty有沖突
    }return Optional.empty();
    
  }
  
  
  
  public String toString(){
    return " company name = "+this.companyName+" staff List = "+this.staffList;
  }

  public static void main(String[] args) {
    company c1=new company("abc");
    staff s1=new staff("sam", 15000);
    staff s2=new staff("ken", 18000);
    staff s3=new staff("ben", 12000);
    staff s4=new staff("peter", 20000);
    
    c1.staffList.add(s1);
    c1.staffList.add(s2);
    c1.staffList.add(s3);
    c1.staffList.add(s4);
    /* System.out.println(c1.getListofupperthan15000());
    System.out.println(c1.getListofupperthan20000()); */
    //System.out.println(c1.getListofupperthan14000());
    System.out.println(c1.getListofupperthan25500());

    
    

    

    


  }
  
}
