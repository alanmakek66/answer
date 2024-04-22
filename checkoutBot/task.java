package checkoutBot;

public class task {

  private userINFO userINFO;
  private website websites;

  public task(website websites){
    this.websites=websites;
    this.userINFO=userINFO;
  }

  public void runBot(){
    if(this.websites==websites.ADIDAS){
      System.out.println("go adidas");
    }
    if(this.websites==websites.NIKE){
      System.out.println("go nike");
    }
    if(this.websites==websites.NEWBALANCE){
      System.out.println("go newbalace");
    }



  }

  public static void main(String[] args) {
    task task01=new task(website.ADIDAS);
  }


  
  }


