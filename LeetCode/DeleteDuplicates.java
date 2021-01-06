

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}


public class DeleteDuplicates {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode dummy = new ListNode(-101);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.val == current.next.val) {
        while (current != null && current.next != null && current.val == current.next.val) {
          current = current.next;
        }
        prev.next = current.next;
        current = current.next;
      } else {
        prev = prev.next;
        current = current.next;
      }

    }
    return dummy.next;
  }
}
