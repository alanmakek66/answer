package dice;

import student.subjectOfA;

public class player {

  // private int score;

  public int startRoll() {
    int score = 0;
    roll[] r1 = new roll[] { new dice1(), new dice2() };
    for (roll rr : r1) {
      score = score + rr.roll();
    }
    return score;

    /*
     * for(int i=0;i<r1.length;i++){
     * score=score+ r1[i].roll();
     * }return score;
     */

  }

  public result startRoll2(){
    result r1 = new result();
    r1.setColor(new dice1().roll2());
    r1.setFood(new dice2().roll2());
    return r1;
  }

  

  public static void main(String[] args) {
    player p1=new player();
    System.out.println(p1.startRoll());
    System.out.println(p1.startRoll2());
  }

}
