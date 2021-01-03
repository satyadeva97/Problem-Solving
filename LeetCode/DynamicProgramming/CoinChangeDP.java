package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeDP {
  public static void main(String[] args) {
    int[] coins = new int[]{1, 2, 5};
    int amount = 11;
    System.out.println(coinChange(coins, amount));
  }

  private static int coinChange(int[] coins, int amount) {

    int[][] result = new int[coins.length + 1][amount + 1];

    for (int i = 1; i < result[0].length; i++) {
      result[0][i] = amount + 1;
    }

    for (int j = 1; j < result.length; j++) {
      for (int k = 1; k < result[0].length; k++) {
          if (coins[j - 1] > k) {
            result[j][k] = result[j - 1][k];
          } else {
            result[j][k] = Math.min(result[j - 1][k], Math.min(1 + result[j - 1][k - coins[j - 1]], 1 + result[j][k - coins[j - 1]]));
          }


      }
    }
    System.out.println(Arrays.deepToString(result));
    return result[coins.length][amount] > amount? -1 : result[coins.length][amount];
  }
}
