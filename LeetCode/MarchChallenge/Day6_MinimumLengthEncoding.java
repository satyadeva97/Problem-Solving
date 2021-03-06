package MarchChallenge;

import java.util.Arrays;

public class Day6_MinimumLengthEncoding {
  public static void main(String[] args) {
    System.out.println(minimumLengthEncoding(new String[] {
            "time", "me", "bell"
    }));
  }

  //bruteforce - 0 ( n^2 * m)
  public static int minimumLengthEncoding(String[] words) {

    Arrays.sort(words, (a, b) -> b.length() - a.length());
    int minLength = words[0].length() + 1;
    boolean flag = false;
    for (int i = 1; i < words.length; i++) {
      flag = false;
      for (int j = 0; j < i; j++) {
        int len1 = words[i].length();
        int len2 = words[j].length();
        if ((words[j].substring(len2 - len1, len2).equals(words[i]))) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        minLength += words[i].length() + 1;
      }

    }
    return minLength;

  }
}
