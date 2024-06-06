package BinaryTree;

import java.util.*;

/*
    https://leetcode.com/problems/binary-tree-postorder-traversal/

 */
public class IterativePostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        /*
            Iterative postorder is nothing but reverse of reversalPreOrder only one difference
            in preorder I used to put right first here I will put left first don't need to use second stack
            First perform preorder only in this first put the left node into stack & then right node and keep
            adding into list and finally before return the list reverse them using Collection.reverse(list)
            method then reverse

         */
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode temp = stack.pop();
            list.add(temp.val);

            if(temp.left!=null){
                stack.push(temp.left);
            }
            if(temp.right!=null){
                stack.push(temp.right);
            }

        }
        Collections.reverse(list);
        return list;
    }
}
