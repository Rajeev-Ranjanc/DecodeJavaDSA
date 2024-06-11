package BST;

import java.util.ArrayList;

public class KthSmallest {

    public int kthSmallest_Optimal(TreeNode root, int k) {
       /*
        In brute force it is taking more time like O(n) & also O(n) space complexity to reduce this
        I can do morris traversal by that I can do in O(n) time complexity & O(1)
        */
        return -1;
    }



    public int kthSmallest(TreeNode root, int k) {
        /*
            Extreme brute force I can think about I can traverse the entire tree byy Inorder
            Traversal and store all the node val into an arrayList I will get all the elements
            into sorted order and after traversal I can simply return the k-1 th element from
            arraylist

            TC: O(N)
            SC: O(N)
            not good
         */

        ArrayList<Integer> a = new ArrayList<>();
        helper(root, a);
        return a.get(k - 1);
    }

    private void helper(TreeNode root, ArrayList<Integer> a) {
        if (root == null) {
            return;
        }
        helper(root.left, a);
        a.add(root.val);
        helper(root.right, a);
    }

}
