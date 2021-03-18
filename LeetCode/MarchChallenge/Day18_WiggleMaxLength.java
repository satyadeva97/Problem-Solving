package MarchChallenge;

public class Day18_WiggleMaxLength {
  public int wiggleMaxLength(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int[][] dp = new int[nums.length][2];
    dp[0][0] = 0;
    dp[0][1] = 0;

    for (int i = 1; i < nums.length; i++) {
      for (int  j = 0; j < i; j++) {
        if (nums[i] - nums[j] > 0) {
          dp[i][1] = Math.max(dp[j][0] + 1, dp[i][1]);

        } else if (nums[i] < nums[j]) {
          dp[i][0] = Math.max(dp[j][1] + 1, dp[i][0]);
        }

      }
    }
    return 1 + Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
  }
}
