package student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class studentA {
  private String name;
  private double averageScore;
  private List<subjectOfA> subjects;

  public studentA(String name){
    this.name=name;
    this.averageScore=averageScore;
    this.subjects=new ArrayList<>(List.of(subjectOfA.Chinese,subjectOfA.English,subjectOfA.Maths));
  }

  public String getName(){
    return this.name;
  }

  
  public List<subjectOfA> getSubjects(){
    return this.subjects;
  }
  public List<subjectOfA> getFailSubject(){
     //List<subjectOfA> failList=
     return this.getSubjects().stream().filter(x->x.getScore()<50)
    .collect(Collectors.toList());
    //return failList;
}
public Double getaverageScore(){
  double totalscore=0.0;
  for(int i=0;i<this.getSubjects().size();i++){
    totalscore=totalscore+this.getSubjects().get(i).getScore();
} this.averageScore=totalscore/this.getSubjects().size();
return totalscore/this.getSubjects().size();
}
public String toString(){
  return "Student name ="+ this.name+"average score = "+this.averageScore+"subject"+
  this.subjects;
}

public boolean upgrade(){
  return this.getaverageScore()>=50;
}

public static void main(String[] args) {
  studentA s1=new studentA("sam");
  System.out.println(s1.getFailSubject());
  System.out.println(s1.getaverageScore());
  System.out.println(s1.upgrade());
  
}
  
}
