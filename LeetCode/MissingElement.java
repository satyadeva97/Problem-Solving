public class MissingElement {
  public static void main(String[] args) {
    int[] A = new int[]{1, 3, 2, 5, 6, 4, 7};
    System.out.println(missingElement(A));
  }

  private static int missingElement(int[] A) {
    int n = A.length;
    int sum = 0;
    //sum of all the numbers in the array.
    for (int i = 0; i < n; i++) {
      sum += A[i];
    }

    //The actual sum if all the elements were present
    int sumToBe = ((n + 1) * (n + 2)) / 2;

    return sumToBe - sum;
  }
//    int n = A.length;
//    //creating an auxillary array to store which elements are present.
//    int[] temp = new int[n + 1];
//    //if an element is present in the array. put 1 into that respective index in the auxillary array
//    for (int i = 0; i < n; i++) {
//      temp[A[i] -1] = 1;
//    }
//    //if the value inside any index is 0 in the auxillary array, then that is the missing element.
//    for (int i = 0; i < n + 1; i++) {
//      if (temp[i] == 0) {
//        return i + 1;
//      }
//    }
//    return -1;
//  }
}
