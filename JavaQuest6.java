

public class JavaQuest6 {
  public static void main(String[] args) {
    /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
 
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    
    
      
          
          
          int[] fibonacci = new int[15]; 
          
          fibonacci[0] = 1;
          fibonacci[1] = 1;
          
          for (int i = 0; i < 15; i++) {
            if(i>=2){fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];}
              
          }
          
          
          for (int i = 0; i < 15; i++) {
              System.out.println(fibonacci[i]);
          }
      }
  

    
    



 
  



  
  
}


