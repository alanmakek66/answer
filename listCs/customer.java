package listCs;

import java.util.Objects;

public class customer {
  private String name;

  public customer(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object obj){
    if(this==obj){
      return true;
    } else if(!(obj instanceof customer)){
      return false;
    }customer c1=(customer) obj;
    return Objects.equals(this.name, c1.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
 }

 @Override
 public String toString(){
  return " customer = "+this.name;
 }



  
  
}
