package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Club {
  private List<Member> memberList; 

  public Club(){
    this.memberList=new ArrayList<>();
  }
  public List<Member> getAllMemberList(){
    return this.memberList;
  }
  public List<Member> getFemaleList(){
    List<Member>FemaleList
    =this.getAllMemberList().stream()
    .filter(e->Gender.Female.equals(e.getGender()))
    .collect(Collectors.toList());
    return FemaleList;
  }
  public List<Member> getAdultList(){
    List<Member>adultList
    = this.getAllMemberList().stream().filter(e->e.getAge()>=18)
    .collect(Collectors.toList());
    return adultList;
  }
  public Map<Gender,String> getGenderMap(){
    Map<Gender,String>GenderMap
    =this.getAllMemberList().stream()
    .collect(Collectors.groupingBy(e->(Gender)e.getGender()
    ,Collectors.mapping(e->e.getName(), Collectors.joining(", "))));
    return GenderMap; 
  }

  public static void main(String[] args) {
    Member m1=Member.build()
    .name("sam")
    .age(18)
    .gender(Gender.Male)
    .build();
    Member m2=Member.build()
    .name("sally")
    .age(20)
    .gender(Gender.Female)
    .build();
    Member m3=Member.build()
    .name("tom")
    .age(8)
    .gender(Gender.Male)
    .build();
    Member m4=Member.build()
    .name("vincent")
    .age(28)
    .gender(Gender.Male)
    .build();
    Club c1=new Club();
    c1.getAllMemberList().add(m1);
    c1.getAllMemberList().add(m2);
    c1.getAllMemberList().add(m3);
    c1.getAllMemberList().add(m4);

    System.out.println(c1.getFemaleList());
    System.out.println(c1.getAdultList());
    
  }
  
}
