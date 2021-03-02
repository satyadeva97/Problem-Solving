import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WightedStrings {
  public static void main(String[] args) {
    System.out.println(str(20));
  }

  private static String str(long weight) {
    int[] arr = new int[26];
    Map<Integer, Character> map = new HashMap<Integer, Character>();
    Character temp = 'A';
    int initialNumber = 1;
    int j = 3;
    for (int i = 1; i < 26; i++) {
      map.put(initialNumber, temp++);
      initialNumber = initialNumber * j++;
    }

    arr[0] = 1;
    j = 3;
//    int  j = 3;
    for (int i = 1; i < 26; i++) {
      arr[i] = arr[i - 1] * j++;
    }

    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > weight)  {
        index = i - 1;
        break;
      }
    }
    StringBuilder ret = new StringBuilder();
    while (weight > 0) {
      while (weight < arr[index]) {
        index--;
      }
      ret.append(map.get(arr[index]));
      weight -= arr[index];
    }
    return ret.reverse().toString();
  }
}
