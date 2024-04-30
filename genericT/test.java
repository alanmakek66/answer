package genericT;

import java.util.List;

public class test {
  static <T extends Number>int sum(T x,T y){
    return x.intValue()+y.intValue();
  }
// ?只存在於<內>
  static <? super Integer>int sum1(List<?> x,List<?> y){
    return x.get(0).intValue();
  }  // ? class有可能沒有intValue功能

  public static void main(String[] args) {

    System.out.println(sum(2, 5));
    
  }
  
}
