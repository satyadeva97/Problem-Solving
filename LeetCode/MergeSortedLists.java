public class MergeSortedLists {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

  class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

      ListNode result = new ListNode(-1);
      ListNode temp = result;
      while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
          // result.next = new ListNode(l1.val);
          result.next = l1;
          l1 = l1.next;
        } else {
          // result.next = new ListNode(l2.val);
          result.next = l2;
          l2 = l2.next;
        }
        result = result.next;
      }

      if (l1 != null) {
        result.next = l1;
      } else {
        result.next = l2;
      }
      return temp.next;

    }
  }
}
