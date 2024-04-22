package checkoutBot;

import java.util.ArrayList;

//aaraylist 需要自行new 1次開通位置;

public class userINFO {
  private ArrayList<ccard> cardList;
  //private ccard[] card;
  private ArrayList<email> emailList;
  //private email[] emails;
  
  private ArrayList<shippingA> addressList;

  //private shippingA[] address;
  //private ArrayList<task> taskList;
  //private task[] tasks;

  public userINFO() {
    //this.tasks = new task[0];
    //this.taskList=taskList;
    this.addressList = new ArrayList<>();
    //this.addressList=addressList;
    this.emailList=new ArrayList<>();
    this.cardList=new ArrayList<>();
    //this.cardList=cardList;
  }

  /* public void addTask(task t1) {
    task[] copyArr = this.tasks;
    this.tasks = new task[this.tasks.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.tasks[i] = copyArr[i];
      idx = idx + 1;
    }
    this.tasks[idx] = t1;

  } */

  @Override 
  public String toString(){
    return "address = "+this.addressList+" email = "+this.emailList
    +" ccard = "+this.cardList;
  }

  public static void main(String[] args) {
    userINFO user01=new userINFO();
    user01.addressList.add(shippingA.MONGKOK);
    user01.emailList.add(new email("2313@gmail.com"));
    user01.cardList.add(new ccard("sam", "1111-2222-3333-4444","25-25" ));
    /* user01.addressList.add(shippingA.ADDRESS2.getAddress());
    user01.addressList.add(shippingA.ADDRESS3.getAddress());  */

    /* user01.emailList.add(email.email1);
    user01.emailList.add(email.email2);
    user01.emailList.add(email.email3);

    user01.cardList.add(ccard.MASTER1);
    user01.cardList.add(ccard.VISA1);
    user01.cardList.add(ccard.VISA2); */

    System.out.println(user01);




    


  }

}
