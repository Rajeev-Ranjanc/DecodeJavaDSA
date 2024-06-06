package BinaryTree;

public class LevelOrderWithoutQueue {
/*
    Kabhi bhi interviewer puchh le kabhi ki aako level order traversal krna hai no using BFS, using DFS
    then this, One of the smartest interviewer will ask such question and if you tell this. You are done 100%
 */

    public void nthLevelNode(TreeNode root, int k) {
        helper(root, k, 0);
    }

    private void helper(TreeNode root, int k, int l) {

        if (root == null) {
            return;
        }

        if (k == l) {
            System.out.print(root.val + "  ");
        }

        helper(root.left, k, l + 1);
        helper(root.right, k, l + 1);
        /*


        if (k == l) {
            System.out.print(root.val + "  ");
        }

        helper(root.left, k, l + 1);
        helper(root.right, k, l + 1);
  */
        if (k == l) {
            System.out.print(root.val + "  ");
        }

        helper(root.left, k, l + 1);
        helper(root.right, k, l + 1);
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.left = h;
        g.right = i;

        LevelOrderWithoutQueue lq = new LevelOrderWithoutQueue();

//        I can find this 3 which is nothing but total no of levels which is also height of binary tree.

        for (int k = 0; k <= 3; k++) {
            lq.nthLevelNode(a, k);
            System.out.println();
        }
    }
}
