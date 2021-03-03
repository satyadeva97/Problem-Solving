package MarchChallenge;

import java.util.HashSet;
import java.util.Set;

public class Day1_SetMismatch {
  public int[] findErrorNums(int[] nums) {

    Set<Integer> set = new HashSet();
    int repeated = -1;
    int missingNumber = -1;
    for (int i = 0; i < nums.length; i++) {
      if (!set.add(nums[i])) {
        repeated = nums[i];
      }
    }
    for (int i = 1; i <= nums.length; i++) {
      if (!set.contains(i)) {
        missingNumber = i;
      }
    }
    return new int[] {repeated, missingNumber};
  }
}
