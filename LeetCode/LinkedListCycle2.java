public class LinkedListCycle2 {
  public ListNode detectCycle(ListNode head) {
    ListNode temp1 = head;
    ListNode temp2 = head;
    if (head == null || head.next == null) {
      return null;
    }

    while (temp1 != null && temp2 != null && temp2.next != null) {
      temp1 = temp1.next;
      temp2 = temp2.next.next;
      if (temp1 == temp2) {
        while (temp1 != head) {
          temp1 = temp1.next;
          head = head.next;
        }
        return head;
      }
    }
    return null;

//         Set<ListNode> hashSet = new HashSet<>();

//         while (!(head == null)) {
//             if (hashSet.contains(head)) {
//                 return head;
//             } else {
//                 hashSet.add(head);
//                 head = head.next;
//             }
//         }
//         return null;
  }
}
