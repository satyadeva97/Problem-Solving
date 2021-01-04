package backTracking;

import java.util.ArrayList;
import java.util.List;

//In the commented code, I am first creating the permutations and then checking whether it is
// beautiful or not. However to reduce time complexity, I added extra checks in the recursive
// function itself so that we don't progress if there is no possibility of beautiful arrangement
// (remove the extra function and put those two conditions inside the recursive function itself)
public class BeautifulArrangement {

  private static int count;

  public static void main(String[] args) {
    int n = 3;
    System.out.println(countArrangement(n));
  }



  public static int countArrangement(int n) {
    boolean[] visited = new boolean[n];
    List<Integer> current = new ArrayList<>();
    permute(n, visited, current);
    return count;

  }

  private static void permute(int n, boolean[] visited, List<Integer> current) {
    if (current.size() == n) {
      System.out.println(current.toString());
      // if (isBeautiful(current)) {
      count++;
      // }
      return;
    }

    for (int i = 1; i <= n; i++) {
      if (!visited[i - 1] && (i % (current.size() + 1) == 0 || (current.size() + 1) % i == 0)) {

        visited[i - 1] = true;
        current.add(i);

        permute(n, visited, current);
        visited[i - 1] = false;
        current.remove(current.size() - 1);
      }
    }
  }

  // private boolean isBeautiful(List<Integer> current) {
  //     for (int j = 0; j < current.size(); j++) {
  //         if (current.get(j) % (j + 1) != 0 && (j + 1) % current.get(j) != 0) {
  //             return false;
  //         }
  //     }
  //     return true;
  // }


}
