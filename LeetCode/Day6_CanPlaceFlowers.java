public class Day6_CanPlaceFlowers {
  public static void main(String[] args) {
    int [] arr = new int[]{0};
    System.out.println(canPlaceFlowers(arr, 1));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n <= 0) {
      return true;
    }
    int count = 0;
    int result = 0, i = 0;
    while ( i < flowerbed.length  && flowerbed[i] == 0) {
      count ++;
      i++;
    }
    result = count / 2;
    int  j;
    count = 0;
    outer:
    for (j = i; j < flowerbed.length; j++) {
      if (flowerbed[j] == 1) {
        if (count == 0) {
          continue outer;
        } else {
          result += ((count + 1) / 2) - 1;
          count = 0;
        }
      } else {
        count++;
      }
    }
    if (j > 1 && flowerbed[j - 1] == 0 && flowerbed[j - 2] == 0) {
      result ++;
    }
    if (result == n) {
      return true;
    } else {
      return false;
    }
  }
}
