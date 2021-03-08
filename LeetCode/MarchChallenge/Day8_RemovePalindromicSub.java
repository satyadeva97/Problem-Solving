package MarchChallenge;

public class Day8_RemovePalindromicSub {
  public int removePalindromeSub(String s) {
    if (s == null || s.length() == 0) return 0;
    return isPalindrome(s) ? 1 : 2;

  }

  private boolean isPalindrome(String s) {
    int n = s.length() - 1;
    int i = 0;
    while (i <= n) {
      if (!(s.charAt(i++) == s.charAt(n--))) {
        return false;
      }
    }
    return true;
  }
}
