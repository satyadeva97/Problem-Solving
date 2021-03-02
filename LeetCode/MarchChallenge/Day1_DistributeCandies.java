package MarchChallenge;

import java.util.HashSet;
import java.util.Set;

public class Day1_DistributeCandies {
  public int distributeCandies(int[] candyType) {

    Set<Integer> result = new HashSet<>();
    int n = candyType.length;

    for (int i = 0; i < n; i++) {
      result.add(candyType[i]);
    }

    return result.size() > n/2 ? n/2 : result.size();

  }
}
