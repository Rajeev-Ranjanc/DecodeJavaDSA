package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

//    https://leetcode.com/problems/binary-tree-paths/

/*

https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=root-to-leaf-paths

Nothing Fancy did it my own.

Just wrote a helper function in that I have passed 3 things one is root node
second is a blank String and third is an ArrayList in which I'm adding the path.
first wrote the base case if root is null simply return and checked if I'm at
the leaf node then first add value of node in the string without arrow and then
added that string into list and return else added value of node with arrow and
call for left recursion and then right recursive call and done. Did it own my own


*/
    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        helper(root, "", list);

        return list;
    }

    public void helper(TreeNode root, String str, ArrayList<String> list) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            str += root.val;
            list.add(str);
            return;
        } else {
            str += root.val + "->";

            helper(root.left, str, list);
            helper(root.right, str, list);
        }

    }

}
