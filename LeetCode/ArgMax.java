public class ArgMax {
  public static void main(String[] args) {
    int[] arr = new int[]{4, 6, 18, 12, 25};

    System.out.println(computeArgMax(arr));
  }

  private static int computeArgMax(int[] arr) {
    if (arr == null) return -1;
    int argMax = 0;
    int maxValue = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        argMax = i;
        maxValue = arr[i];
      }

    }
    return argMax;
  }
}
