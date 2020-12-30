import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day7_PopulatingNextRightPointers {
  static class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
      val = _val;
      left = _left;
      right = _right;
      next = _next;
    }
  }

  private static Map<Integer, List<Node>> map = new HashMap<>();
  public static void main(String[] args) {
    Node root = new Node(1);
    root.right = new Node(3);
    root.right.right = new Node(7);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    connect(root);
    System.out.println("Hi");
  }

  private static Node connect(Node root) {
    int order = 0;
    Node result = root;
    List<Node> arr;
    preOrder(root, order);
    for (Integer temp : map.keySet()) {
      arr = map.get(temp);
      for (int i = 0; i < arr.size() - 1; i++) {
        arr.get(i).next = arr.get(i + 1);
      }
      arr.get(arr.size() - 1).next = null;
    }
    return result;
  }

  private static void preOrder(Node root, int order) {

    if (root == null) return;

    System.out.println(root.val);
    if (map.containsKey(order)) {
      map.get(order).add(root);
    } else {
      map.put(order, new ArrayList<Node>());
      map.get(order).add(root);
    }
    preOrder(root.left, order + 1);
    preOrder(root.right, order + 1);
  }
}
