package MarchChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Day9_addOneRowToATree {
  public TreeNode addOneRow(TreeNode root, int v, int d) {
    if (d == 1) {
      TreeNode temp = new TreeNode(v);
      temp.left = root;
      return temp;
    }
    Queue<TreeNode> que = new LinkedList<>();
    TreeNode dummy = root;
    que.add(root);
    int level = 0;
    TreeNode first = null;
    TreeNode second = null;
    while (que.size() > 0) {
      int n = que.size();
      level++;
      for (int i = 0; i < n; i++) {
        if (level == d - 1) {
          TreeNode temp = que.poll();
          first = null;
          second = null;
          if (temp.left != null) {
            first = temp.left;
          }
          if (temp.right != null) {
            second = temp.right;
          }
          temp.left = new TreeNode(v);
          temp.right = new TreeNode(v);
          temp.left.left = first;
          temp.right.right = second;

        } else {
          TreeNode temp = que.poll();
          if (temp.left != null) {
            que.add(temp.left);
          }
          if (temp.right != null) {
            que.add(temp.right);
          }
        }

      }
    }
    return dummy;
  }
}
