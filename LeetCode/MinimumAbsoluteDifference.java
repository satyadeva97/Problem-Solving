import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {


  public List<List<Integer>> minimumAbsDifference(int[] arr) {

    Arrays.sort(arr);
    int min = Integer.MAX_VALUE;
    int[] diff = new int[arr.length - 1];
    for (int i = 0; i < arr.length - 1; i++) {
      diff[i] = arr[i + 1] - arr[i];
      min = Math.min(min, diff[i]);

    }
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < diff.length; i++) {
      if (diff[i] == min) {
        result.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
      }
    }
    return result;
  }
}

