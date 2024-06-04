package BinaryTree;

public class PathSum {
    //    https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNode root, int targetSum) {
/*
        Wow, Rajeev you did a fantastic job. Keep going dude.
        to solve this problem did a dry run

        First of all handle the base case if node is null return false.
        then check that the root node is leaf node? if yes then first of all
        decreases the value of that node from target_sum and then return targetSum==0
        and outside this call a recursive call for its left subtree and for right subtree
        and perform an or operation between its left and right call and returned them
 */
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            targetSum -= root.val;
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);


    }
}
