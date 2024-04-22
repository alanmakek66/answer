package checkoutBot;

//import dice.result;
public class email{

/* public enum email {
  email1("abc1111@gmail.com"),
  email2("abc2222@gmail.com"),
  email3("abc3333@gmail.com"),
  ; */

  private String email;

  public email(String email){
    this.email=email;
  }
  
  public String getEmailAddress(){
    return this.email;
  }

  public String toString(){
    return " email = "+this.email;
  }

}
  

