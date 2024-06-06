package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_Iterative {
/*
    https://leetcode.com/problems/binary-tree-preorder-traversal/description/

    First of all declared a stack of TreeNode type and list which is to be return of Integer type
    and check if root is not null then add that root into sack and ran a loop while stack is not
    empty inside loop remove the top of stack. After popping from the stack added the value of that
    node into list and first checked their top.right if not null then put their right node into stack
    and then did same for left and keep doing till stack is not empty. Finally, return the list

*/
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            list.add(top.val);
//            always used to push left first but here I'm storing in stack so LIFO will perform ss,
//            we can perform preorder traversal easily
            if (top.right != null) {
                stack.push(top.right);
            }
            if (top.left != null) {
                stack.push(top.left);
            }
        }
        return list;
    }
}
