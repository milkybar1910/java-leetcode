package InorderTraversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Main {
    public List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helperFunction(root, result);
        return result;
    }

    public void helperFunction(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null)
                helperFunction(root.left, result);
            result.add(root.val);
            if (root.right != null)
                helperFunction(root.right, result);
        }
    }
}
