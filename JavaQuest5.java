
public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    int countingc = 0;
    int countingz = 0;

for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == target) {
        countingc=countingc+1;
    }
}

if (countingc >0) {
    System.out.println("We found " + countingc + " character " + target + " in the string.");
} else {
    System.out.println("Not Found.");
}



    for (int i = 0; i < str.length(); i = i + 1) {
      if (str.charAt(i) == 'z') {
        countingz = countingz + 1;
      }
    }

    if (countingz >= 1) {
      System.out.println("We found Z");
    } else {
      System.out.println("Not Found.");
    }

  }
}

// Use a loop to count the target of character in a String.
// code here ...

// if found, print "We found 3 character c in the String."
// if not found, print "Not Found."
// code here ...
