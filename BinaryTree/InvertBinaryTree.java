package BinaryTree;
/*
https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    /*
        Invert means a mirror Image of Binary tree wow what a fantastic
        feel to solve by ourselves. Its just simple just swap the left
        and right node. using a temporary node later call the recursive
        call for left subtree and right subtree and finally return the
        root of the tree
        beats 100% of java user
     */
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
