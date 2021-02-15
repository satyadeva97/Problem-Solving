import java.util.Arrays;

public class SortUsingFlips {
  public static void main(String[] args) {
    char[] arr = new char[]{'C', 'B', 'A', 'B','B','C','A', 'A', 'C', 'B'};
    sortusingFlip(arr);
  }

  private static void sortusingFlip(char[] arr) {
    int i = 0;
    int j = arr.length - 1;
    int k = 0;
    while (i < j & k < j) {
      if (arr[k] == 'C') {
        flip(arr, k, j);
        j--;
        flip(arr, k, j);
      } else if (arr[k] == 'A') {
        flip(arr, i, k);
        i++;
        flip(arr,i, k);
        k--;
      }
      k++;
    }
    System.out.println(Arrays.toString(arr));
  }


  private static void flip(char arr[],  int j, int i) {
    char temp;
    while (j < i) {
      temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
      j++;
      i--;
    }

  }
}
