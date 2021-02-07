public class OddEven {
  public ListNode oddEvenList(ListNode head) {

    if (head == null) return null;
    ListNode currentOdd = head;
    ListNode currentEven = head.next;
    ListNode dummyEven = currentEven;
    while (currentEven != null && currentEven.next != null) {
      currentOdd.next = currentOdd.next.next;
      currentEven.next = currentEven.next.next;
      currentEven = currentEven.next;
      currentOdd = currentOdd.next;

    }

    currentOdd.next = dummyEven;

    return head;

  }
}
