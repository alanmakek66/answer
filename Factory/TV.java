package Factory;

interface TV {
  void watch();
  public class ChinaTV implements TV{
    @Override
    public void watch(){
      System.out.println("watch tv show");
    }
  }
  public class JapanTV implements TV{
    @Override
    public void watch(){
      System.out.println("watch tv show");
    }
  }
  public class VietnamTV implements TV{
    @Override
    public void watch(){
      System.out.println("watch tv show");
    }
  }
}
