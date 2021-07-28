package SameTree;

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
    public boolean sameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return sameTree(p.right, q.right) && sameTree(p.left, q.left);
    }
}
