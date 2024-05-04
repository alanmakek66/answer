package Factory;

interface Factory {
  Computer createComputer();

  Phone createPhone();

  TV createTV();

  public class ChinaFactory implements Factory {
    @Override
    public Computer createComputer() {
      return new Computer.ChinaComputer();
    }

    @Override
    public Phone createPhone() {
      return new Phone.ChinaPhone();
    }

    @Override
    public TV createTV() {
      return new TV.ChinaTV();
    }
  }

  public class JapanFactory implements Factory {
    @Override
    public Computer createComputer() {
      return new Computer.JapanComputer();
    }

    @Override
    public Phone createPhone() {
      return new Phone.JapanPhone();
    }

    @Override
    public TV createTV() {
      return new TV.JapanTV();
    }
  }

  public class VietnamFactory implements Factory {
    @Override
    public Computer createComputer() {
      return new Computer.VietnamComputer();
    }

    @Override
    public Phone createPhone() {
      return new Phone.VietnamPhone();
    }

    @Override
    public TV createTV() {
      return new TV.VietnamTV();
    }
  }

  public static void main(String[] args) throws Exception {
    Factory f1=Factory.createFactory(MadeIn.Japan);
    f1.createComputer().turnOn();

  }

  public static Factory createFactory(MadeIn m1)  throws Exception{
    switch (m1) {
      case China:
        return new ChinaFactory();
      case Japan:
        return new JapanFactory();
      case Vietnam:
        return new VietnamFactory();

    } throw new Exception("unkown");
  }

}
