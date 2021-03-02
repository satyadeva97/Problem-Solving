import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sortUsingFlipsKFruits {
  public static void main(String[] args) {
    char[] arr = new char[]{'C', 'B', 'G', 'A', 'B', 'I', 'B', 'D', 'H', 'E', 'F', 'C', 'A', 'A', 'C', 'B'};
    sortusingFlip(arr, 9);
  }

  private static <ArrayListList> void sortusingFlip(char[] arr, int num) {
    Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(arr[i] - 'A')) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(i);
        map.put(arr[i] - 'A', temp);
      } else {
        ArrayList<Integer> temp1 = map.get(arr[i] - 'A');
        temp1.add(i);
        map.put(arr[i] - 'A', temp1);
      }
    }
    int m = 0;

    for (int i = 0; i < map.size(); i++) {
      if (map.containsKey(i)) {
        ArrayList<Integer> temp2 = map.get(i);
        for (int p = 0; p < temp2.size(); p++) {
          flip(arr, m, temp2.get(p));
          m++;
          flip(arr, m, temp2.get(p));
          adjustIndexes(map, temp2.get(p));
        }
      }

    }
    System.out.println(Arrays.toString(arr));

  }

  private static void adjustIndexes(Map<Integer, ArrayList<Integer>> map, int index) {
    for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
      ArrayList<Integer> temp2 = entry.getValue();
      for (int p = 0; p < temp2.size(); p++) {
        if (temp2.get(p) < index) {
          temp2.set(p, temp2.get(p) + 1);
        }
      }
      map.put(entry.getKey(), temp2);
    }
  }

  private static void flip(char arr[], int j, int i) {
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
