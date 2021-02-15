//package DynamicProgramming;
//
//
//import java.util.Arrays;
//
//public class SubsetSumCount {
//  public static void main(String[] args) {
//    int [] arr = new int[] {2, 3, 5, 6, 8, 10};
//    int sum = 10;
//    System.out.println(subsetCount(arr, sum));
//  }
//
//  private static int subsetCount(int[] arr, int sum) {
//    int [][] result = new int[arr.length + 1][sum + 1];
//    for (int i = 0; i <= arr.length; i++) {
//      result[i][0] = 1;
//    }
//    int i = Integer.parseInt("123");
//    for (int i = 1; i <= arr.length; i++) {
//      for (int j = 1; j <= sum; j++) {
//        if (arr[i - 1] <= j) {
//          result[i][j] = result[i - 1][j] + result[i - 1][j - arr[i - 1]];
//
//        } else {
//          result[i][j] = result[i - 1][j];
//        }
//      }
//    }
//    for (int i = 0; i < result.length; i++) {
//      System.out.println(Arrays.toString(result[i]));
//    }
////    System.out.println(Arrays.deepToString(result));
//    return result[arr.length][sum];
//  }
//
//}
