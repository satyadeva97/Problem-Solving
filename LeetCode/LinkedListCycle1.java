public class LinkedListCycle1 {
  public boolean hasCycle(ListNode head) {

//         Set<ListNode> hashSet = new HashSet<>();

//         while (!(head == null)) {
//             if (hashSet.contains(head)) {
//                 return true;
//             } else {
//                 hashSet.add(head);
//                 head = head.next;
//             }
//         }
//         return false;
    ListNode temp1 = head;
    ListNode temp2 = head;
    if (head == null || head.next == null) {
      return false;
    }

    while (temp1 != null && temp2 != null && temp2.next != null) {
      temp1 = temp1.next;
      temp2 = temp2.next.next;
      if (temp1 == temp2) {
        return true;
      }
    }
    return false;


  }
}
