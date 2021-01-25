import java.util.Arrays;

public class IdentifyTwoMissingNumbers {

  public static int[] getTwoMissingNumebrs(int[] a) {

    int[] ans = new int[2];

    int xor = 0;

    int n = a.length;
    int m = n + 3;

    for (int i = 1; i < m; i++) {
      xor ^= i;
    }

    for (int i = 0; i < n; i++) {
      xor ^= a[i];
    }

    int numberWithLastSetBitDifferent = getNumberWithLastSetBitDifferent(xor);

    int bucket1 = 0, bucket2 = 0;

    for (int i = 1; i < m; i++) {
      if ((numberWithLastSetBitDifferent & i) != 0) {
        bucket1 ^= i;
      } else {
        bucket2 ^= i;
      }
    }

    int bucket3 = 0, bucket4 = 0;

    for (int i = 0; i < n; i++) {
      if ((numberWithLastSetBitDifferent & a[i]) != 0) {
        bucket3 ^= a[i];
      } else {
        bucket4 ^= a[i];
      }
    }

    ans[0] = bucket1 ^ bucket3;
    ans[1] = bucket2 ^ bucket4;

    return ans;
  }

  private static int getNumberWithLastSetBitDifferent(int xor) {

    int count = 0;

    while (xor > 0) {
      if ((xor & 1) == 1) {
        return 1 << count;
      }
      xor >>= 1;
      count += 1;
    }

    return 0;
  }

  public static void main(String[] args) {

    int[] a = new int[]{1, 2, 4, 5, 6, 7, 9, 10};

    System.out.println(Arrays.toString(getTwoMissingNumebrs(a)));

  }


}
