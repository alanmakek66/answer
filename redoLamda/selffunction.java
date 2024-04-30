package redoLamda;

import java.util.function.Function;

@FunctionalInterface
interface selffunction {

  int count(String x,String y,String z);

  public static void main(String[] args) {
    selffunction s1=(x,y,z)->x.concat(y).concat(z).length();
    System.out.println(s1.count("sam", "ken", "alan"));
    //Function
  }
  
}
