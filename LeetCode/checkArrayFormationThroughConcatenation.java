public class checkArrayFormationThroughConcatenation {
  public boolean canFormArray(int[] arr, int[][] pieces) {

    int[] index = new int[101];
    //since the limit to value inside arr is 100, create an array to get the index in constant time.
    for (int i = 0; i < arr.length; i++) {
      index[arr[i]] = i;
    }
    for (int[] piece: pieces) {
      int startIndex = index[piece[0]];
      if (arr.length - startIndex < piece.length) {
        return false;
      }
      for (int j = 0; j < piece.length; j++, startIndex++) {
        if (arr[startIndex] != piece[j]) {
          return false;
        }
      }
    }
    return true;

  }
}
