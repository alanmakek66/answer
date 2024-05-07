package clothes;

import clothes.Cap.NIKECap;
import clothes.Pants.NIKEPants;
import clothes.Tee.NIKETee;

interface Shop {
  Tee sellTee();
  Pants sellPants();
  Cap sellCap();

  public class NIKEcategory implements Shop{
    public Tee sellTee(){
      return new NIKETee();
    }
    public Pants sellPants(){
      return new NIKEPants();
    }
    public Cap sellCap(){
      return new NIKECap();
    }
  }

  public static NIKEcategory create(brand brand1) throws Exception{
    switch (brand1) {
      case NIKE:
      return new NIKEcategory();
        
        break;
    
      default:
        break;
    }
  }
  
  
}
