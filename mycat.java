public class mycat {
  private String Color;
  private String Variety;
  private int Age; 

  public void setColor(String x){
    this.Color=x;
  }
  public void setVariety(String x){
    this.Variety=x;
  }
  public void setAge(int x){
    this.Age=x;
  }
  public String toString(){
    return "mycat("+"Variety = "+this.Variety
    +" Color = "+this.Color+" Age = "+this.Age;
  }


  public static void main(String[] args) {
    mycat fatcat=new mycat();
    fatcat.setAge(2);
    fatcat.setVariety("British Shorthair");
    fatcat.setColor("White");
    System.out.println(fatcat.toString());


  }
  
  


}


