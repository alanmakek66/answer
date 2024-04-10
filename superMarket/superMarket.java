package superMarket;
import java.util.Arrays;

public class superMarket {
  private String brandName;
  private branch[] branchs;

  public superMarket(String brandName){
    this.brandName=brandName;
    this.branchs=new branch[0];

  }

  public void add(branch branchs){
    branch[] newarr=this.branchs;
    this.branchs=new branch[this.branchs.length+1];
    int idx=0;
    for(int i=0;i<newarr.length;i++){
      this.branchs[idx++]=newarr[i];
} this.branchs[idx]=branchs;

  }

  public String toString(){
    return "brandname = "+this.brandName+" branch = "+Arrays.toString(this.branchs);
  }



  
}
