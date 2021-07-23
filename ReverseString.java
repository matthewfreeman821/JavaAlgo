public class ReverseString {

  String pali = "Hello olleH";
  String notPali = "Hello";
  String notPali2 = "0912938@3";

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
      reversedString = reversedString + s.charAt(i);
    }
    return reversedString;
  }

  public static String reverseString3(String s) {
    StringBuilder newString = new StringBuilder(s);
    String reversedString = newString.reverse().toString();
    return reversedString;
  }

  public static boolean isPalindrome(String s) {
    String reversedString = reverseString(s);
    char[] stringCharArray = s.toCharArray();
    char[] reversedStringCharArray = reversedString.toCharArray();
    int count = 0;
    for (int i = 0; i < s.length() / 2; i++) {
      if (stringCharArray[i] == reversedStringCharArray[i]) {
        count++;
      }
    }
    return count == s.length() / 2;
  }

  public static boolean isPalindrome2(String s) {
    String reversedString = reverseString(s);
    int count = 0;
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) == reversedString.charAt(i)) {
        count++;
      }
    }
    return count == s.length() / 2;
  }

  public static boolean isPalindrome3(String s) {
    // Utlize an enhanced for loop to evaluate if the string is a palindrome

    return true;
  }

  public static boolean isPalindrome4(String s) {
    // Utlize a predicate to evaluate if the string is a palindrome

    return true;
  }

  public static void main(String[] args) {
    System.out.println("Currently works perfectly");
  }
}