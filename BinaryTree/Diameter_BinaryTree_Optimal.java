package BinaryTree;

public class Diameter_BinaryTree_Optimal {
    static int maxDia;
/*
    https://leetcode.com/problems/diameter-of-binary-tree/
    understand this
    O(n) time complexity
 */
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }

    public int levels(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = levels(root.left);
        int right = levels(root.right);

        int dia = left + right;

        maxDia = Math.max(dia, maxDia);

        return Math.max(left, right) + 1;


    }
}
