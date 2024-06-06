package BinaryTree;
/*
    https://leetcode.com/problems/balanced-binary-tree/

 */
public class BalanceBinaryTree {
    /*
        Best way to do this is in the O(n) complexity is this see
        Balanced_Optimal class code
     */

    public boolean isBalanced(TreeNode root) {
        /*
        In this I'm just checking at every step that is my node is balance and that node is saying let me ask my
        child node and if the node become null we returned true if and did same for the right binary tree
        and if the left and right both are true, and we find the difference of height of the binary left and
        right binary tree is less than equal to 1 then returned true otherwise false
        */
        if(root == null){
            return true;
        }

        boolean lef = isBalanced(root.left);

        boolean rig = isBalanced(root.right);

        boolean diff = Math.abs (height(root.left) - height(root.right)) <= 1;

        return lef && rig && diff;

    }

    //finding height of the binary tree
    public int height(TreeNode root){

        // int count = 0;
        //base case
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left , right) +1 ;
    }
//    TC : O(n^2) i.e. n!
}
