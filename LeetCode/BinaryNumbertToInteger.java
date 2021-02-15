import java.util.ArrayList;
import java.util.List;

public class BinaryNumbertToInteger {
  public int getDecimalValue(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head =head.next;
    }

    int sum = 0;
    for (int j = list.size() - 1; j >= 0; j--) {
      sum += Math.pow(2, list.size() - (j + 1)) * list.get(j);
    }
    return sum;
  }
}
