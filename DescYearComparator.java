import java.util.Comparator;

class DescYearComparator implements Comparator<Movies> {

  @Override
    public int  compare(Movies m1, Movies m2){
        if(m1.getYear()>m2.getYear()){
            return -1;
        }return 1;
    }
 

 


  
}
