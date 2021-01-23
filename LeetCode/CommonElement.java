class Node {
  int val;
  Node next;

  Node() {
  }

  Node(int val) {
    this.val = val;
  }

  Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}

public class CommonElement {
  public static void main(String[] args) {
    Node list1 = new Node(1);
    list1.next = new Node(2);
    list1.next.next = new Node(3);
    list1.next.next.next = new Node(4);

    Node list2 = new Node(0);
    list2.next = list1.next.next.next;

    System.out.println(common(list1, list2).val);
  }

  private static Node common(Node list1, Node list2) {
    if (list1 == null || list2 == null) {
      return new Node(-1);
    }
    int m = length(list1);
    int n = length(list2);
    int count = 0;

    if (m >= n) {
      while (count < (m - n)) {
        list1 = list1.next;
        count++;
      }
    } else {
      while (count < (n - m)) {
        list2 = list2.next;
        count++;
      }
    }

    while(true) {
      if (list1 == list2) {
        return list1;
      }
      list1 = list1.next;
      list2 = list2.next;
    }

  }

  private static int length(Node list) {
    if (list == null) {
      return 0;
    }

    return 1 + length(list.next);
  }
}
