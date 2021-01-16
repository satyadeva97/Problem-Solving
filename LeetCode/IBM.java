import java.util.Arrays;

public class IBM {
  public static void main(String[] args) {

    meandering(new int[]{1, 39, 4, 8, 23});
  }

  private static void meandering(int[] arr) {
    Arrays.sort(arr);
    int[] result = new int[arr.length];
    int i = 0, j = arr.length - 1;
    int k = 0;
    while (i < j) {
      result[k] = arr[j];
      result[k + 1] = arr[i];
      i++;
      j--;
      k += 2;
    }
    if (k == arr.length - 1) {
      result[k] = arr[i];
    }
    System.out.println(Arrays.toString(result));


  }
}
