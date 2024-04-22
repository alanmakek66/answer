package checkoutBot;

import java.time.LocalDate;

public class ccard {
  /* VISA1("CHAN MAN","1111-1111-1111-1111","12-2028"),
  VISA2("LEE MAN","1111-1111-2222-2222","11-2028"),
  MASTER1("MAN MAN","3333-3333-2222-2222","10-2028"),
  ; */

  private String name;
  private String cardNO;
  private String expiryDate;

  public ccard(String name,String cardNo,String expiryDate){
    this.name=name;
    this.cardNO=cardNo;
    this.expiryDate=expiryDate;
  }

  public String getCcardName(){
    return this.name;
  }

  public String toString(){
    return "name = "+this.name+" cardNo = "+this.cardNO+
    "expiryDate = "+this.expiryDate;
  }


  
}
