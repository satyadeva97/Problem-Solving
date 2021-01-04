package backTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
  class Solution {

    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
      helper(nums, 0, new ArrayList());
      return result;
    }

    private void helper(int[] nums, int n, List<Integer> current) {
      result.add(new ArrayList<>(current));

      for (int i = n; i < nums.length; i++) {
        current.add(nums[i]);
        helper(nums, i + 1, current);
        current.remove(current.size() - 1);
      }
    }
  }
}
