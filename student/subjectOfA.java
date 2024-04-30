package student;

public enum subjectOfA {
  Chinese(80),
  English(40),
  Maths(70),
  ;
  private int score;
  private subjectOfA(int score){
    this.score=score;
  }

  public int getScore(){
    return this.score;
  }
  
}
