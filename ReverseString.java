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

  public static void main(String[] args) {
    System.out.println(isPalindrome("123321"));
    System.out.println(isPalindrome("hello"));
  }
}