package BST;

public class FindClosetInBST {
/*
  https://www.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1
  Nothing fancy first of all checked is root null if so simply returned the K otherwise
  ran a loop till root is not null. before it initialised a variable called tillMax in this
  I'm storing minimum difference between root value and K on every move either it left or right
  and if root val is equal to the K then return otherwise if root.val is smaller than K root made right
  move else left move but everytime I'm updating the tillMax on every move.
*/

    static int minDiff(TreeNode root, int K) {

        // Write your code here
        if (root == null) {
            return K;
        }
        int tillMax = Integer.MAX_VALUE;

        while (root != null) {
            if (root.val == K) {

                return 0;

            } else if (root.val < K) {

                tillMax = Math.min(Math.abs(root.val - K),tillMax);
                root = root.right;

            } else {
                tillMax = Math.min(Math.abs(root.val - K),tillMax);
                root = root.left;

            }
        }
        return tillMax;
    }

}
