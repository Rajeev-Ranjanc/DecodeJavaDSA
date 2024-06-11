package BST;

import java.util.ArrayList;

public class TwoSum_Iv {
    public boolean findTarget(TreeNode root, int k) {
        /*
            https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

            Extreme brute force I can think about it by using inorder traversal, By inorder traversal I can get
            a sorted arraylist and after that out problem become of two sum problem, and we can do this. and this is
            extreme naive approach.
            TC : O(n)
            Sc : O(n)

            Optimal is


         */
        ArrayList<Integer> al = new ArrayList<>();
        helper(root, al);
        int i = 0;
        int j = al.size() - 1;

        while (i < j) {
            int sum = al.get(i) + al.get(j);
            if (sum == k) {
                return true;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    private void helper(TreeNode root, ArrayList<Integer> al) {

        if (root == null) {
            return;
        }

        helper(root.left, al);
        al.add(root.val);
        helper(root.right, al);

    }

}
