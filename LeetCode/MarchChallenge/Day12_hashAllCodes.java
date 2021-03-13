package MarchChallenge;

import java.util.HashSet;
import java.util.Set;

public class Day12_hashAllCodes {
  public boolean hasAllCodes(String s, int k) {
    int n = (int) Math.pow(2, k);
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(i);
    }
    //System.out.println(set.toString());
    int temp = -1;
    for (int i = 0; i <= s.length() - k; i++) {
      temp = Integer.parseInt(s.substring(i, i + k), 2);
      if (set.contains(temp)) {
        set.remove(temp);
      }

    }
    //System.out.println(set.toString());
    return set.size() == 0 ? true : false;
  }
}
