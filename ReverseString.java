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
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == reversedString.charAt(s.length() - 1 - i)) {
        count++;
      }
    }
    return count == s.length();
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("123321"));
  }
}