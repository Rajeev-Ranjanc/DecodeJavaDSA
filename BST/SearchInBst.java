package BST;

public class SearchInBst {
    /*
    https://leetcode.com/problems/search-in-a-binary-search-tree/
        Nothing fancy just ran a while loop till root is not null and check if root.val is less than the
        val then we make root to root.right else if smaller than val then we made root to its left else I
        make return root and outside the while loop return null because if the given val is not found in
        the tree then it means that val is not present in the binary search tree.
     */
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {

            if (root.val < val) {

                root = root.right;

            } else if (root.val > val) {

                root = root.left;

            } else {

                return root;

            }

        }

        return null;
    }
}
