class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public class CorrespondingNodeInTheClone {
  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

    return traverse(cloned, target);
  }

  private TreeNode traverse(TreeNode cloned, TreeNode target) {
    if (cloned == null) {
      return null;
    }

    if (cloned.val == target.val) {
      return cloned;
    }

    TreeNode dest = traverse(cloned.left, target);
    if (dest == null) {
      dest = traverse(cloned.right, target);
    }
    return dest;
  }
}
