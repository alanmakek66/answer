package Factory;

interface Computer {
  void turnOn();
  void turnOff();

  public class ChinaComputer implements Computer{
    @Override
    public void turnOn(){
      System.out.println("turn on");
    }
    @Override
    public void turnOff(){
      System.out.println("turn off");
    }
  }

  public class JapanComputer implements Computer{
    @Override
    public void turnOn(){
      System.out.println("turn  on jp");
    }
    @Override
    public void turnOff(){
      System.out.println("turn off");
    }
  }

  public class VietnamComputer implements Computer{
    @Override
    public void turnOn(){
      System.out.println("turn on");
    }
    @Override
    public void turnOff(){
      System.out.println("turn off");
    }
  }
  
}
