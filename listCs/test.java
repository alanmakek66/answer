package listCs;

import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    //ArrayList<Integer>i1=new ArrayList<>();
  ArrayList<ArrayList<Integer>> iii=new ArrayList<>();
  
  ArrayList<Integer>i1=new ArrayList<>();
  iii.add(i1);
  System.out.println(iii);
  System.out.println(i1==iii.get(0));
  ArrayList<Integer>test=new ArrayList<>(i1);
  System.out.println(test);
  //ArrayList<ArrayList<Integer>> i456=new ArrayList<>(i1);

  ArrayList<String> s1=new ArrayList<>();
  String[]sss=new String[10];
  ArrayList<String> s2=new ArrayList<>(s1);
  System.out.println(s2);
 
  /* Collection;
  List */

  
    
  }
  

  
  
  
 
  
}
