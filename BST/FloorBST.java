package BST;

public class FloorBST {
    /*
        https://www.geeksforgeeks.org/problems/floor-in-bst/1
     */
    public static int floor(TreeNode root, int x) {
        // Code here
        int ans = -1;
        while (root != null) {

            if (root.val == x) {

                return root.val;

            } else if (root.val < x) {

                ans = root.val;
                root = root.right;

            } else {

                root = root.left;

            }
        }

        return ans;

    }
}
