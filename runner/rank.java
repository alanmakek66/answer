package runner;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Queue;

public class rank  {

  private Queue<runner> runners;
  private LocalDate macthDate;
  private runner winner;

  public rank() {
    this.runners = new ArrayDeque<>();
    this.macthDate = LocalDate.now();
    this.winner = this.runners.poll();
  }

  public Queue<runner> getQueueR() {
    return this.runners;
  }

  public runner getWinner() {
    return this.winner;
  }

  public Queue<runner> checkException() throws IllegalArgumentException {
    for(int i=0;i<this.getQueueR().size();i++){
      if (this.getQueueR().poll().getName() == null||this.getQueueR().poll().getSpeed() <= 0) {
        throw new IllegalArgumentException();
        //this.getQueueR().remove()
      }

    }

    return this.getQueueR();
  }

  public static void main(String[] args) {
    rank rank1 = new rank();

    runner r1 = new runner("sam", 10.0);
    runner r2 = new runner("peter", -8);
    runner r3 = new runner(null, 7);
    runner r4 = new runner("ken", 7.5);
    runner r5 = new runner("jason", 17);

    rank1.getQueueR().add(r5);
    rank1.getQueueR().add(r4);
    rank1.getQueueR().add(r3);
    rank1.getQueueR().add(r2);
    rank1.getQueueR().add(r1);

    /* System.out.println(rank1.getQueueR().size()); */
    //System.out.println(rank1.getQueueR());

    try {
      rank1.checkException();
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }



  }

}
