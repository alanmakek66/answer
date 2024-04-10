import java.util.Arrays;
public class Student {
  private String name;
  private Subject[] subject;
  

  public Student(String name){
    this.name=name;
    this.subject=new Subject[0];

  }

  public void add(Subject subject){
    Subject[]copyarr=this.subject;//<<是舊array
    this.subject=new Subject[this.subject.length+1];
    int idx=0;
    for(int i=0;i<copyarr.length;i++){
      this.subject[idx++]=copyarr[i];
    }
    this.subject[idx]=subject;


  }
  
  public String toString() {
    return "Student("+" Name = "+ this.name+" ,Subject =" + Arrays.toString(this.subject)+")";
    
  }
  
}

