package MarchChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
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

public class Day5_averageOfLevels {
  public List<Double> averageOfLevels(TreeNode root) {
    TreeNode dummy = root;
    List<Double> result = new ArrayList<>();
    Queue<TreeNode> que = new LinkedList<>();
    long sum, count;
    que.add(root);
    while (que.size() > 0) {
      sum = 0;
      count = 0;
      int size = que.size();
      for (int i = 0; i < size; i++) {
        TreeNode temp = que.poll();
        sum += temp.val;
        count++;
        if (temp.left != null)
          que.add(temp.left);
        if (temp.right != null)
          que.add(temp.right);
      }
      result.add((double) sum / count);

    }
    return result;

  }

}
