import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RightSideView {
  List<Integer> result = new ArrayList<Integer>();
  Set<Integer> set = new HashSet<>();

  public List<Integer> rightSideView(TreeNode root) {
    traverse(root, 0);
    return result;

  }

  private void traverse(TreeNode root, int index) {
    if (root == null) {
      return;
    }
    if (!set.contains(index)) {
      set.add(index);
      result.add(root.val);
    }

    traverse(root.right, index +1);
    traverse(root.left, index +1);
  }
}
