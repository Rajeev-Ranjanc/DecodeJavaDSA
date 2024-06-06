package BinaryTree;


public class Test {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        boolean height = Math.abs(height(root.left) - height(root.right)) <= 1;
        return left && right && height;
    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
