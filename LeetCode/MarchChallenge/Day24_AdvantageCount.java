package MarchChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Day24_AdvantageCount {
  public int[] advantageCount(int[] A, int[] B) {
    int[] result = new int[A.length];
    Arrays.sort(A);
    int[] b1 = B.clone();
    Arrays.sort(b1);
    Map<Integer, Queue<Integer>> map = new HashMap<>();
    int j = A.length - 1, k = 0;

    for (int i = b1.length - 1; i >= 0; i--) {
      if (A[j] > b1[i]) {
        if (map.containsKey(b1[i])) {
          map.get(b1[i]).add(A[j--]);
        } else {
          map.put(b1[i], new LinkedList<Integer>());
          map.get(b1[i]).add(A[j--]);
        }
      } else {
        if (map.containsKey(b1[i])) {
          map.get(b1[i]).add(A[k++]);
        } else {
          map.put(b1[i], new LinkedList<Integer>());
          map.get(b1[i]).add(A[k++]);
        }
      }
    }

    for (int t = 0; t < B.length; t++) {
      result[t] = map.get(B[t]).poll();
    }


    return result;
  }
}
