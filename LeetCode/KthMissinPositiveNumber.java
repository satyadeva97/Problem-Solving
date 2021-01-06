public class KthMissinPositiveNumber {
  public int findKthPositive(int[] arr, int k) {
    int max = arr[arr.length - 1];
    int index = 0;
    int count = 0;
    for (int i = 1; i <= max; i++) {
      if (arr[index] == i) {
        index++;
      } else {
        count++;
        if (count == k) {
          return i;
        }
      }
    }
    return max + (k - count);
  }
}
