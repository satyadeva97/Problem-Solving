import java.util.Deque;
import java.util.LinkedList;

public class LRUCache {
  public static void main(String[] args) {
    int num = 6;
    int[] arr = new int[]{1,2,1,3,1,2};
    int maxSize = 2;
    System.out.println(numMissing(num, arr, maxSize));
  }

  private static int numMissing(int num, int[] arr, int maxSize) {
    int count = 0;
    Deque<Integer> deq = new LinkedList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      if (!deq.contains(arr[i])) {
        count++;
        if ((deq.size() >= maxSize)) {
          deq.pollFirst();
        }
        deq.addLast(arr[i]);
      } else {
        deq.remove(arr[i]);
        deq.addLast(arr[i]);
      }

    }
    return count;

  }
}
