package BinaryTree;
/*
    https://leetcode.com/problems/symmetric-tree/

    Wow, what a fantastic experience to solve by own.
    first of all I have simply inverted the right subtree of the tree
    (I can invert any subtree either left or right) now I just need to
    check is left and right subtree of the original tree is same if yes
    then return true otherwise return false;

 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode temp = invert(root.right);
        return helper(root, temp);
    }

    public boolean helper(TreeNode root, TreeNode temp) {

        if (temp != null && root == null) {
            return false;
        }
        if (root != null && temp == null) {
            return false;
        }
//        Base case
        if (root == null && temp == null) {
            return true;
        }


        boolean left = helper(root.left, temp.left);
        boolean right = helper(root.right, temp.right);
        boolean val = (root.val == temp.val);
        return (left && right && val);
    }

    private TreeNode invert(TreeNode root) {

        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;

    }
}
