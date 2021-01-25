//public class Missing2Elements {
//  public static void main(String[] args) {
//    int[] A = new int[]{1, 3, 2, 5, 6, 4, 7};
//    System.out.println(missingElements(A));
//  }
//
//  private static int missingElements(int[] A) {
//    int n = A.length;
//    int sum = 0;
//    //sum of all the numbers in the array.
//    for (int i = 0; i < n; i++) {
//      sum += A[i];
//    }
//
//    int j = n + 1;
//    int i = n;
//    while (j >= 1) {
//      printMissingcharacters(A, j, sum, i);
//      j--;
//    }
//
//    return sumToBe - sum;
//  }
//
//  private static void printMissingcharacters(int[] a, int j, int sum, int i) {
//    if (j == 1) {
//      return;
//    }
//
//    if (!((sum - j) == sum - a[i])) {
//      System.out.println(j);
//      printMissingcharacters()
//    }
//
//  }
//
//
//}
