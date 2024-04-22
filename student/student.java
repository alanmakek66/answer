package student;

import java.util.Arrays;

public class student {
  //學生ID、姓名、年齡、科目列表
  private String name;
  private String studentID;
  private int age;
  private subject[] subjects;

  public student(String name,String studentID,int age ){
    this.name=name;
    this.studentID=studentID;
    this.age=age;
    this.subjects=new subject[0];}

    public void addSubject(subject subject){
      subject[] copyArr = this.subjects;
    this.subjects = new subject[this.subjects.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      subjects[idx++] = copyArr[i];
    }
    subjects[idx] = subject;
}

/* public int getScore(){
  return this.
} */

    public double ava(){
      if (subjects.length == 0) {
        return 0.0; 
    }
      int totalScore = 0;
    for (int i = 0; i < subjects.length; i++) {
        totalScore += subjects[i].getScore();  
    }
    return (double) totalScore / subjects.length;
    }
    

    public String toString(){
      return "Name = "+this.name+" StudentID = "+this.studentID+" Age = "+this.age
      +" subject = "+ Arrays.toString(this.subjects); 
    }

  
  
}
