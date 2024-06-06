package BinaryTree;

public class Balanced_Optimal {
    static boolean ans;
/*
    Best
 */
    public boolean isBalanced(TreeNode root) {
        ans = true;
        height(root);
        return ans;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int diff = Math.abs(left - right);
        if (diff > 1) {
            ans = false;
            return -1;
        }
        return Math.max(left, right) + 1;
    }

}
