package factory2;

interface Factory {
  Phone sellPhone();

  public class CheapFactory implements Factory{
    @Override
    public Phone sellPhone(){
      return new Phone.CheapPhone();
    }
  }

  public static Factory createFactory(Style s1) throws Exception{
    switch (s1) {
      case Cheap:
      return new CheapFactory();
        
        break;
    
      default:
        break;
    }
  }
  
}
