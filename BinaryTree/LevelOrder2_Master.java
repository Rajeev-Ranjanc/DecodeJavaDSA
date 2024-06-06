package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder2_Master {
    /*
        https://leetcode.com/problems/binary-tree-level-order-traversal/

        https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/1278355229/
        see this code to make level order traversal without using queue with the help of nth order
        traversal



     */

    private int level(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(level(root.left), level(root.right)) + 1;
    }

    private void nthLevel(TreeNode root, int i, int level, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (i == level) {
            arr.add(root.val);
        }
        nthLevel(root.left, i + 1, level, arr);
        nthLevel(root.right, i + 1, level, arr);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        int lvl = level(root);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < lvl; i++) {

            ArrayList<Integer> arr = new ArrayList<>();
            nthLevel(root, 0, i, arr);
            ans.add(arr);
        }
        return ans;
    }
}

