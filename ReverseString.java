public class ReverseString {
  public static String reverseString(String s) {
    String reversed = "";
    char[] stringArray = s.toCharArray();

    for (int i = s.length() - 1; i >= 0; i--) {
      reversed = reversed + stringArray[i];
    }
    return reversed;
  }

  public static void main(String[] args) {
    System.out.println("Reversing a string");
    System.out.println(reverseString("Hello"));
  }
}