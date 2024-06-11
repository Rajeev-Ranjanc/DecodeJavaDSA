package BST;

public class LCABST {
    /*    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
        Pretty simple and easy you just need to understand the question as in Binary Tree LCA
        I used to search the P in the left and Q in the right part of the tree and if so then return
        true otherwise check again check in either left subtree or right subtree.

        But, In this I just need to check if the p and q both are smaller than the root then I need to check in
        the left subtree and if both are p and q values are more than the root node val then I need to search n the
        right subtree otherwise only one case remain which is p lies in left part of the tree and q lies in right part
        of the queues so in at last simply return root
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) {
            return root;
        }
        if (p.val < root.val && q.val < root.val) {
//            it means p and q lies in the left of the root
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
//            it means p and q both lies int the right part of the bst
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;


    }
}

