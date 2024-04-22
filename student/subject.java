package student;

public class subject {
  private String subjectName;
  private int score;

  public subject(String subjectName, int score) {
    this.subjectName = subjectName;
    this.score = score;

  }

  public int getScore(){
    return this.score;
  }

  public String toString(){
    return "subjectName = "+this.subjectName+" score = "
    +this.score;
    
  }

  public static void main(String[] args) {
    subject chinese=new subject("chinese", 70);
    subject english=new subject("english", 80);
    
    student s1=new student("eric", "s118", 16);
    s1.addSubject(chinese);
    s1.addSubject(english);
    System.out.println(s1.ava());

    
    
  }

}
