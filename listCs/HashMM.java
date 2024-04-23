package listCs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMM {
  public static void main(String[] args) {
    HashMap<customer,ArrayList<order>> test1=new HashMap<>();
    order order1=new order(1000);
    order order2=new order(80);
    ArrayList<order> list1=new ArrayList<>();
    list1.add(order1);
    list1.add(order2);
    System.out.println(list1.size());//2
    System.out.println(list1);
    ArrayList<order>list2=new ArrayList<>();
    list2.add(new order(20));
    list2.add(new order(2000));
    list2.add(new order(50));

    test1.put(new customer("sam"), list1);
    //test1.put(new customer("sam"), new ArrayList<order>());
    
    test1.put(new customer("peter"),list2);
    System.out.println(test1);
    System.out.println(ttAmount(test1));
    System.out.println(ttAmount2(test1));

    //Collection c1=new ArrayList<>();

    
    

  }
  

  public static int ttAmount(HashMap<customer,ArrayList<order>> test1){
    int total=0;
    for(Map.Entry<customer,ArrayList<order>> map:test1.entrySet()){
      for(order o1 : map.getValue()){
        total=total+o1.getAmount();
      }

    }return total;
  }
  public static int ttAmount2(HashMap<customer,ArrayList<order>> test1){
    int total=0;
    
    ArrayList<order> orders=new ArrayList<>();
    ArrayList<ArrayList<order>> orderlists=new ArrayList<>(test1.values());
    
    for(int i=0;i<test1.size();i++){
      orders = new ArrayList<>(orderlists.get(i));//ArrayList<order>沒有get.Amount
      
      for(int j=0;j<orders.size();j++){
        total=total+orders.get(j).getAmount();
        
      }
    }return total;
  }
  

  

  

  
  
}
