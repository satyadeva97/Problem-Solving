package MarchChallenge;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class Day4_IntersectionOf2LinkedLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    ListNode dummy1 = headA;
    ListNode dummy2 = headB;
    int len1 = 0, len2 = 0;
    while (dummy1 != null || dummy2 != null) {
      if (dummy1 != null) {
        dummy1 = dummy1.next;
        len1++;
      }
      if (dummy2 != null) {
        dummy2 = dummy2.next;
        len2++;
      }
    }
    int j = 0;
    if (len1 > len2) {
      while (j < len1 - len2) {
        headA = headA.next;
        j++;
      }
    } else {
      while (j < len2 - len1) {
        headB = headB.next;
        j++;
      }
    }

    while (headA != null || headB != null) {
      if (headA == headB) return headA;
      else {
        headA = headA.next;
        headB = headB.next;
      }
    }
    return null;
  }
}
