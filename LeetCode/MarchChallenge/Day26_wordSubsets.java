package MarchChallenge;

import java.util.ArrayList;
import java.util.List;

public class Day26_wordSubsets {
  public List<String> wordSubsets(String[] A, String[] B) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      if (isGlobal(A[i], B)) {
        result.add(A[i]);
      }
    }
    return result;
  }


  private boolean isGlobal(String s, String[] B) {
    int[] arr1 = auxillaryArray(s);
    for (int i = 0; i < B.length; i++) {
      if (!isSubset(arr1, B[i])) {
        return false;
      }
    }
    return true;
  }

  private boolean isSubset(int[] arr1, String s2) {
    int[] arr2 = auxillaryArray(s2);
    for (int i = 0; i < arr1.length; i++) {
      if (!(arr2[i] <= arr1[i])) {
        return false;
      }
    }
    return true;
  }

  private int[] auxillaryArray(String s) {
    int[] arr = new int[26];
    for (char c: s.toCharArray()) {
      arr[c - 'a']++;
    }
    return arr;
  }
}
