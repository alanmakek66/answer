package listforest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hh {

  public static void main(String[] args) {
    HashMap<forest,ArrayList<animals>> map1=new HashMap<>();
    animals a1=new animals("cat");
    //ArrayList<animals> aaa=new ArrayList<>(new animals("cat"));
    ArrayList<animals>aaa=new ArrayList<>(List.of(new animals("cat")));


    map1.put(new forest("amaze"), null);
  }
  
}
