import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    int[] result = new int[nums.length - k + 1];
    Deque<Integer> deq = new LinkedList<>();

    for (int i = 0; i < nums.length; i++) {
      while (deq.size() > 0 && nums[deq.peekLast()] < nums[i]) {
        deq.pollLast();
      }
      deq.addLast(i);
      if ((i - k + 1) > deq.peekFirst()) {
        deq.pollFirst();
      }
      if (i >= k - 1) {
        result[i - k + 1] = nums[deq.peek()];
      }

    }
    return result;

  }

}
