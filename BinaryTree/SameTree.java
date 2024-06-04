package BinaryTree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*

        https://leetcode.com/problems/same-tree/

        Pretty simple and clear just checked base condition if the root node or any other node of both
        tree is null then return false and if any one of node is null is others is not null then return
        false and after that we call a recursive call for the left subtree and again we call other recursive             call for the right subtree and after that we compare the data of both root and stored into a variable
        of boolean type and finally checked if all these three boolean variables are true or not if not then
        return false otherwise return
        true
*/
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (q == null && p != null) {
            return false;
        }
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        boolean ans = (p.val == q.val);
        return (left && right && ans);

    }
}
