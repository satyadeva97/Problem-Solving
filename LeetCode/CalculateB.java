import java.util.Arrays;



public class CalculateB {
  public static void main(String[] args) {
    int[] A = new int[]{2, 3, 4, 7, 5, 9, 8};
    int k = 3;
    computeB(A, k);
  }

  private static void computeB(int[] A, int k) {
    int[] B = new int[A.length];
    int n = A.length;
    B[0] = A[0];
    int  i = 1;

    //Since the values for negative indexes are zero, I am not adding them.
    while (i < k) {
      B[i] = A[i] + B[i - 1];
      i++;
    }

    //Sliding window (Remove the A[i - k] from the previous value and add A[k]. This way we can avoid
    //recomputing the same sum again.
    while (i < n) {
      B[i] = B[i - 1] - A[i - k] + A[i];
      i++;
    }
    System.out.println(Arrays.toString(B));
  }
}
