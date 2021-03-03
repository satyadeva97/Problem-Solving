package MarchChallenge;

public class Day3_MissingNumber {
  public int missingNumber(int[] nums) {
    int result = 0;
    for (int i = 1; i <= nums.length; i++) {
      result ^= nums[i - 1] ^ i;
    }

    return result;
  }
}
