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
    String reversedString2 = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      reversedString2 = reversedString2 + s.charAt(i);
    }
    return reversedString2;
  }

  public static String reverseString3(String s) {
    StringBuilder newString = new StringBuilder(s);
    String reversedString3 = newString.reverse().toString();
    return reversedString3;

  }

  public static void testingBoolean() {
    boolean b = true;
    if (b = false) {
      System.out.println("Hello");
    } else {
      System.out.println("Bye");
    }
  }

  public static void main(String[] args) {
    System.out.println("Reversing a string:");
    System.out.println(reverseString("Well hello there"));
    System.out.println("Second way to reverse a string:");
    System.out.println(reverseString2("General Kenobi"));
    System.out.println("Third way to reverse a string:");
    System.out.println(reverseString3("Trying to break it 32434234"));
    testingBoolean();
  }
}