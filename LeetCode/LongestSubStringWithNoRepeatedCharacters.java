public class LongestSubStringWithNoRepeatedCharacters {
  public static void main(String[] args) {
      System.out.println(longestSubString("wwww"));

  }

  private static String longestSubString(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append(s.charAt(0));
    int count = 0;
    for (int i = 1; i < s.length(); i++) {
      count = 1;
      while ( i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
        count++;
        i++;
      }
      if (count != 1) sb.append(count);
      if (i != s.length()) {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}
