import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class BTLevelOrderTraversal2 {


  List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> levelOrderBottom(TreeNode root) {

    int h = height(root);
    for (int i = 0; i < h; i++) {
      result.add(new ArrayList<Integer>());
    }
    traverse(root, h);

    return result;
  }

  private int height(TreeNode root) {

    if (root == null) return 0;

    return 1 + Math.max(height(root.left), height(root.right));
  }

  private void traverse(TreeNode root, int level) {

    if (root == null) return;

    traverse(root.left, level - 1);
    traverse(root.right, level - 1);

    result.get(level - 1).add(root.val);

  }
}
