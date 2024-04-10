
/*
 * 
 * Question : Given an array of strings words, 
 * return the first palindromic(對稱) string in the array.
 *  If there is no such string, return an empty string "".
*/
public class JavaQuest18 {
  public static void main(String[] args) {
    String[] testCase1 = new String[] { "abc", "car", "ada", "racecar", "cool" };
    String[] testCase2 = new String[] { "notapalindrome", "racecar" };
    String[] testCase3 = new String[] { "ADABCCBADA", "car", "ada", "racecar" };
    String[] testCase4 = new String[] { "abc" };

    System.out.println(firstPalindrome(testCase1)); // Output : "ada"
    System.out.println(firstPalindrome(testCase2)); // Output : "racecar"
    System.out.println(firstPalindrome(testCase3)); // Output : "ADABCCBADA"
    System.out.println(firstPalindrome(testCase4)); // Output : "No Palindrome word in String Array."

  }

  private static boolean isPalindrome(String s) {
    int left=0;
    int right=s.length()-1;
    while(left<right){
      if(s.charAt(left)!=s.charAt(right)){
        return false;
      }left++;
      right--;
    }return true;
    
    // hints : if a String is Palindrome , return true
    //
    
  }

  public static String firstPalindrome(String[] words) {
    int count=0;
    // hints : finish the logic by using isPalindrome() , for-loop , if-else
    

    for(int i=0;i<words.length;i++){
      if(isPalindrome(words[i])&&count<1){
        count=count+1;
        return words[i];
        
      }
    }

    return "";
  }

}