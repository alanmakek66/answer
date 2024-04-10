import java.util.Arrays;
public class Subject{
  private String subjectName;
  private int score;

  public Subject(String subjectName, int score){
    this.subjectName=subjectName;
    this.score=score;
  }

  public String toString(){
    return "Subject("+"subjectName = "+this.subjectName+" score = "+this.score+")";
  }

  public static void main(String[] args) {
    Subject s1=new Subject("math", 70);
    Subject s2=new Subject("chinese", 80);
    Subject s3=new Subject("english", 70);
    Subject[]list =new Subject[3];
    list[0]=s1;
    list[1]=s2;
    list[2]=s3;

    
    Student peter=new Student("Peter");
    peter.add(s2);
    System.err.println(peter);
  }

}