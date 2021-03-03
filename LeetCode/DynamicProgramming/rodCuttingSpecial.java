//package DynamicProgramming;
//
//import java.util.Arrays;
//
//public class rodCuttingSpecial {
//  public static void main(String[] args) {
//    int[] arr = new int[]{0,2,3, 4, 5, 6, 8, 20};
//    Arrays.sort(arr);
//    int l = 10;
//    System.out.println(minimumCost(arr, 1 , 5));
//
//  }
//
//  private static int minimumCost(int[] arr, int i, int j) {
//    if (i == j) return arr[j + 1] - arr[i - 1];
//    if (i > j) return 0;
//    else {
//      int min = -1;
//      for (int k = 1; k < arr.length - 1; k++) {
//        min = Math.min (min, (arr[j + 1] - arr[i - 1]) + minimumCost(arr, i, k)
//                + (arr[j + 1] - arr[i - 1]) + minimumCost(arr, k, j));
//
//      }
//      return min;
//    }
//  }
//}
