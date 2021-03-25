package MarchChallenge;

import java.util.Arrays;

public class Day23_ThreeSumWithMultiplicities {
  static int MOD = 1_000_000_007;

  public int threeSumMulti(int[] arr, int target) {
    Arrays.sort(arr);
    long count = 0;
    int l, r;
    for (int i = 0; i < arr.length; i++) {
      l = i + 1;
      r = arr.length - 1;
      while (l < r) {
        if (arr[i] + arr[l] + arr[r] < target) {
          l++;
        } else if (arr[i] + arr[l] + arr[r] > target) {
          r--;
        } else if (arr[l] != arr[r]) {

          int left = 1;
          while (l + 1 < r && arr[l] == arr[l + 1]) {
            left++;
            l++;
          }

          int right = 1;
          while (r - 1 > l && arr[r] == arr[r - 1]) {
            right++;
            r--;
          }

          count += (left * right);
          count %= MOD;

          l++;
          r--;

        } else if (arr[l] == arr[r]) {

          int numCount = r - l + 1;
          count += numCount * (numCount - 1) / 2;

          count %= MOD;

          break;
        }
      }

    }
    return (int) count % MOD;

  }
}
