public class NumOfLongestIncSubSequences {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 5, 4, 7};
    System.out.println(numOfSeq(arr));
  }

  private static int numOfSeq(int[] arr) {
    int max = 0;
    int maxCount = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr.length - i > max) {
        int count = 0;
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] > arr[j - 1]) {
            count++;
          }
        }
        if (count == max) {
          maxCount++;
        } else if (count > max){
          max = count;
          maxCount = 1;
        } else {
          maxCount = 1;
        }
      }

    }
    return maxCount;
  }
}
