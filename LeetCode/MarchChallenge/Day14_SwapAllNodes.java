package MarchChallenge;

import java.util.ArrayList;
import java.util.List;

public class Day14_SwapAllNodes {
  public ListNode swapNodes(ListNode head, int k) {

    List<ListNode> list = new ArrayList<>();
    ListNode dummy = head;
    while (dummy.next != null) {
      list.add(dummy);
      dummy = dummy.next;
    }
    list.add(dummy);
    int n = list.size();
    ListNode temp = list.get(n - k);
    list.set(n - k, list.get(k - 1));
    list.set(k - 1, temp);
    for (int  i = 0; i < list.size() - 1; i++) {
      list.get(i).next = list.get( i + 1);
    }
    list.get(n - 1).next = null;
    return list.get(0);
  }
}
