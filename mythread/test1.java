package mythread;

public class test1 {
  public static int x=10;
  private final Object lock=new Object();


  public static void main(String[] args) {
    Object o1=new Object();
    
    Runnable r1=()->{
      
      for(int i=0;i<1000000;i++){
        synchronized(o1){
      x=x+1;}

    }};

    Thread th1= new Thread(r1);
    Thread th2=new Thread(r1);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    }catch(InterruptedException e){
      System.out.println("error");
    }



    System.out.println(x);
  }
  
}
