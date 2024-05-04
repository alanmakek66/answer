package Factory;

interface Phone {
  void call();


  public class ChinaPhone implements Phone{
    @Override
    public void call(){
      System.out.println("can call others");
    }
  }
  public class VietnamPhone implements Phone{
    @Override
    public void call(){
      System.out.println("can call others");
    }
  }
  public class JapanPhone implements Phone{
    @Override
    public void call(){
      System.out.println("can call others");
    }
  }
}
