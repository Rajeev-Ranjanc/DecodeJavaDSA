package BST;

public class DeleteNodeInBst {
    /*
         https://leetcode.com/problems/delete-node-in-a-bst/

     */
    public TreeNode deleteNode(TreeNode root, int key) {
return null;
    }

    private TreeNode helper(TreeNode root) {

        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            TreeNode rightChild = root.right;
            TreeNode lastRightChild = findLastRight(root.left);
            lastRightChild.right = rightChild;
            return root.left;
        }

    }

    private TreeNode findLastRight(TreeNode root) {

        if (root.right == null) {
            return root;
        }

        return findLastRight(root.right);

    }
}
