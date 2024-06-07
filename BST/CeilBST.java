package BST;

public class CeilBST {
    int findCeil(TreeNode root, int key) {
/*
https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1
   Ceil means equal or greater than the given number
   Nothing Fancy! first declare an ans variable and initialised by 1. ran a while loop till
   root is not null and first made a check is root.val == key if yes then return root.val else
   if root.val is greater than key then update ans variable put into them and root = root.left
   else root = root.right finally return ans

 */
        // Code here
        int ans = -1;

        while (root != null) {

            if (root.val == key) {

                return root.val;

            } else if (root.val > key) {

                ans = root.val;
                root = root.left;


            } else {

                root = root.right;

            }

        }

        return ans;
    }
}
