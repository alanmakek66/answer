package Optional_review;

import java.util.List;
import java.util.Optional;

public class test1 {
  
  public static void main(String[] args) {
    Optional o1=Optional.of("sam");
    System.out.println(o1);
    Optional<Integer> o2=Optional.of(130);

    //Optional<List<String>> oo1= Optional.of()

    String sss=new String("ken");
    System.out.println(test1.sstr(sss));
    System.out.println(sstr(null));
    Optional<String> o3=Optional.of("i love coding");
    
    String s3=o3.orElse("hello");
    System.out.println(s3);
    
  }

  public static Optional<String> sstr(String s1){
    if(s1!=null){
      return Optional.of(s1);
    }
    return Optional.empty();

  }
  
}
