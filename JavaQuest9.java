public class JavaQuest9 {
  public static void main(String[] args) {
    /**
     * Expected Output:
     * J
     * e
     * 3
     * 9
     * 10
     * ab c
     * VenturenixLAB, Coding
     * 19
     * ren
     * VENTURENIXLAB, JAVA
     * venturenixlab, java
     * V*NTUR*NIXLAB, JAVA!!!
     */

    String str = "VenturenixLAB, Java";

    if (str.contains("J")) {
      System.out.println("J");
    }

    int index = -1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        index = i;
        break;
      }

    }
    System.out.println("the 1st e index is " + index);

    int num1 = str.indexOf('t');
    int num2 = str.indexOf('x');
    int num3 = str.indexOf('L');
    System.out.println(num3);
    System.out.println(num2);
    System.out.println(num1);

    // prints J
    // prints e (the 1st e)
    // code here ...

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    System.out.println(abc.trim());
    // prints "ab c"
    System.out.println(str.replace("VenturenixLAB, Java","VenturenixLAB, Coding"));
    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.length());

    // int length()
    // prints 19
    // code here ...
    System.out.println(str.substring(5, 8));

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.replace("e", "*").toUpperCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...

  }

}
