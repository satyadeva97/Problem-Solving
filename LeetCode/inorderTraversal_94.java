import java.util.ArrayList;
import java.util.List;

public class inorderTraversal_94 {
  static class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  private static List<Integer> list = new ArrayList<>();

  public static void main(String[] args) {

    TreeNode root = new TreeNode();
//    root.right = new TreeNode(2);
//    root.right.left = new TreeNode(3);
    System.out.println(inorder(root).toString());
  }

  private static List<Integer> inorder(TreeNode root) {
    temp(root);
    return list;
  }

  private static void temp(TreeNode root) {
    if (root == null) {
      return;
    }
    temp(root.left);
    list.add(root.val);
    temp(root.right);

  }
}
