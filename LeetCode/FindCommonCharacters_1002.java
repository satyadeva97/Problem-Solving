import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters_1002 {
  public List<String> commonChars(String[] A) {

    int[][] arr = new int[A.length][26];
    for(int i = 0; i < A.length; i++) {
      String temp = A[i];
      for (int j = 0; j < temp.length(); j++) {
        arr[i][temp.charAt(j) - 'a']++;
      }
    }
    int min;
    List<String> result = new ArrayList<>();
    outer:
    for (int i = 0; i < 26; i++) {
      min = Integer.MAX_VALUE;
      for (int j = 0; j < A.length; j++) {
        if (arr[j][i] == 0) continue outer;
        min = Math.min(min, arr[j][i]);
      }
      while (min-- > 0) {
        result.add((char)(i + 'a') + "");
      }

    }
    return result;

  }
}
