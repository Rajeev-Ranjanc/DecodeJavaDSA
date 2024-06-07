package BST;

/*
    https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1
 */
public class FindMinMaxBST {
    int minValue(TreeNode root) {

//        for minimum element into BST
        while (root.left != null) {
            root = root.left;
        }

        return root.val;

    }

    int maxValue(TreeNode root) {

//        for minimum element into BST
        while (root.right != null) {
            root = root.right;
        }

        return root.val;

    }

}
