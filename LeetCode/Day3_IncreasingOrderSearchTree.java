public class Day3_IncreasingOrderSearchTree {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  class Solution {
    TreeNode temp = new TreeNode();

    public TreeNode increasingBST(TreeNode root) {
      TreeNode tempCurrent = temp;
      helper(root);
      return tempCurrent.right;
    }

    public void helper(TreeNode root) {
      if (root == null) {
        return;
      }
      helper(root.left);
      temp.right = new TreeNode(root.val);
      temp = temp.right;
      helper(root.right);

    }
  }
}
