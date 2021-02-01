//public class MinimumNumberOfPlatformsRequired {
//  public static void main(String[] args) {
//    int arrival[] = new int[]{ 900, 940, 950, 1100, 1500, 1800 };
//    int departure[] = new int[]{ 910, 1200, 1120, 1130, 1900, 2000 };
//    System.out.println(calculateNumberOfStops(arrival, departure));
//  }
//
//  private static int calculateNumberOfStops(int[] arrival, int[] departure) {
//    int result = 0;
//    int count;
//    for (int i = 0; i < arrival.length; i++) {
//      count = 0;
//      binarySearch(i, departure[i], arrival);
////      for (int j = i; j < arrival.length; j++) {
////        if (arrival[j] < departure[i] && arrival[j] >= arrival[i]) {
////          count++;
////        }
////      }
//      result = Math.max(result, count);
//    }
//    return result;
//  }
//
//  private static int binarySearch(int i, int target, int[] arrival) {
//    int low = i;
//    int high = arrival.length;
//    while (low < high) {
//      int mid = low + (high - low) / 2;
//      if (target < arrival[mid]) {
//        high = mid;
//      } else {
//        low = mid;
//      }
//    }
//  }
//
//
//}
