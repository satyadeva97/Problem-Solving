import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSortArray {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
//    List<Integer> list1 = new ArrayList<>();
//    for (int x: arr1) {
//      list1.add(x);
//    }
//    int[] arr = new int[1001];
//    Arrays.fill(arr, - 1);
//    for (int i = 0; i < arr2.length; i++) {
//      arr[arr2[i]] = i;
//    }
//    Collections.sort(list1, (a, b) -> {
//      if (arr[a] == -1 && arr[b] == -1) {
//        return a - b;
//      } else if (arr[a] == -1) {
//        return 1;
//      } else if (arr[b] == - 1) {
//        return -1;
//      } else {
//        return arr[a] - arr[b];
//      }
//    });
//
//    for (int i = 0; i < arr1.length; i++) {
//      arr1[i] = list1.get(i);
//    }
//    return arr1;
    Map<Integer, List<Integer>> map = new HashMap<>();
    Map<Integer, Integer> index = new HashMap<>();
    for (int i = 0; i < arr2.length; i++) {
      index.put(arr2[i], i);
    }
    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < arr1.length; i++) {
      if (index.containsKey(arr1[i])) {
        if (map.containsKey(index.get(arr1[i]))) {
          map.get(index.get(arr1[i])).add(arr1[i]);
        } else {
          map.put(index.get(arr1[i]), new ArrayList<>());
          map.get(index.get(arr1[i])).add(arr1[i]);
        }
      } else {
        temp.add(arr1[i]);
      }

    }
    Collections.sort(temp);
    List<Integer> lis;
    int j = 0;
    for (int i = 0; i < arr2.length; i++) {
      lis = map.get(i);
      for (Integer x: lis) {
        arr1[j] = x;
        j++;
      }
    }
    for (Integer y: temp) {
      arr1[j] = y;
      j++;
    }

    return arr1;

  }
}
