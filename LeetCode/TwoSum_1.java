import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

  public int[] twoSum(int[] nums, int target) {
    int [] ret = new int[2];

    //O(n*n) solution
//         outer:
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i+1; j < nums.length; j++) {

//                 if (nums[i] + nums[j] == target) {
//                     ret[0] = i;
//                     ret[1] = j;
//                     break outer;
//                 }

//             }
//         }
//         return ret;

    //O(n) solution (extra space)
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length - 1; i++) {
      if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
        ret[0] = i;
        ret[1] = map.get(target - nums[i]);
        break;
      }
    }

    return ret;
  }
}
