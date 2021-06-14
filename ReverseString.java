public class ReverseString {
  public static String reverseString(String s) {
    String reversedString = "";
    char[] stringArray = s.toCharArray();
    for (int i = s.length() - 1; i >= 0; i--) {
      reversedString = reversedString + stringArray[i];
    }
    return reversedString;
  }

  public static String reverseString2(String s) {
    String reversedString = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.println(i);
      System.out.println(s.charAt(i));
      reversedString += reversedString + s.charAt(i);
    }
    return reversedString;
  }

  public static void main(String[] args) {
    System.out.println("Reversing a string:");
    System.out.println(reverseString("Well hello there"));
    System.out.println("Second way to reverse a string:");
    System.out.println(reverseString2("General Kenobi"));
  }
}