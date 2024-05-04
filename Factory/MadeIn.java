package Factory;

enum MadeIn {
  China("mid"),
  Japan("high"),
  Vietnam("low"),
  ;
  
  private String quality ;
  private MadeIn(String quality){
    this.quality=quality;
  }
  public String getQulity(){
    return this.quality;
  }
  
}
