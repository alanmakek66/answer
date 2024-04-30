package redoLamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class function {

  public static void main(String[] args) {
    Function<Integer,Double> f1=s->{
      return s.doubleValue()+5.5;
    };
    System.out.println(f1.apply(10));

    BiFunction<Integer,Integer,Double>f2=(x,y)->x.doubleValue()+y.doubleValue()+5.5;
    //System.out.println(f2.apply(100, 5));


//接收參數
    Consumer<String> c1=s->System.out.println(s);
    BiConsumer<String,Integer> c2=(s,i)->System.out.println(s+i);
    c2.accept("nice", 100);

    Supplier<Integer> s1=()->1000;
    System.out.println(s1.get());

    Supplier<Integer> s2=()->new Random().nextInt(100);
    System.out.println(s2.get());
    
    BiPredicate<Integer,Integer> p1=(x,y)->(x+y)>100;

    System.out.println(p1.test(50, 51));
    Predicate<Integer>p2=x->x>55;
    System.out.println(p2.test(60));

    List<Integer> i1=new ArrayList<>();
    i1.add(100);
    i1.add(200);
    i1.add(50);
    i1.forEach(x->{
      int newValue = x + 50;
            int index = i1.indexOf(x);
            i1.set(index, newValue);
    });
    System.out.println(i1.get(0)); //無法改變x的值;

    
    
  }
  
}
