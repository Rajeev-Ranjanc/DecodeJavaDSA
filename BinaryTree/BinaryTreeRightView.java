package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightView {
    public static void main(String[] args) {
/*
https://leetcode.com/problems/binary-tree-right-side-view/


    Logical! First of all I got the question as that I just need to go
    always right of the tree from which was wrong, instead of this I have
    to add all the nodes of tree which will be visible if we see the tree
    from the right side. It means that node will also will be visible which
    have no sibling but present in left subtree will also be visible.So first
    we need to add the root into list then need to traverse right subtree first
    then left subtree. while traversing the subtree we need to check that am I
    on this level very first time if yes then only I need to add the root element
    into list otherwise not.
    In short, I am traversing the Preorder but in ROOT RIGHT LEFT this sequence
    first root and then right till null and then left till null
 */
    }

    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        helper(root, list, 0);
        return list;

    }

    private void helper(TreeNode root, List<Integer> list, int level) {

        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root.val);
        }
        helper(root.right, list, level + 1);
        helper(root.left, list, level + 1);


    }
}
