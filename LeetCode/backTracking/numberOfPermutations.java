package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numberOfPermutations {
  public static void main(String[] args) {
    System.out.println(permute(new int[]{1, 2, 3}));
  }

  private static List<List<Integer>> permute(int[] nums) {
    boolean[] bool = new boolean[nums.length];
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current  = new ArrayList<>();
    permutate(nums, bool, result, current);
    return result;
  }

  private static void permutate(int[] nums, boolean[] visited, List<List<Integer>> result,
                                List<Integer> current) {
    if (current.size() == nums.length) {
      result.add(new ArrayList(current));
      System.out.println(result.toString());
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        current.add(nums[i]);
        permutate(nums, visited, result, current);
        visited[i] = false;
        current.remove(current.size() - 1);
      }
    }
  }

}
