package superMarket;
import java.util.Arrays;

public class branch {
  private String branchNo;
  private item[] item;

  public branch(String branchNo){
    this.branchNo=branchNo;
    this.item=new item[0];

  }

  public void add(item item){
    item[] newarr=this.item;
    this.item=new item[this.item.length+1];
    int idx=0;
    for(int i=0;i<newarr.length;i++){
      this.item[idx++]=newarr[i];
    }this.item[idx]=item;
  }

  public String toString(){
    return "branchNo = "+this.branchNo+" item = "+Arrays.toString(this.item);
  }


  
}
