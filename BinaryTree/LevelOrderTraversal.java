package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    /*
    https://leetcode.com/problems/binary-tree-level-order-traversal/
    Super simply Nothing fancy, First of all declare a Queue data structure of TreeNode type
    and add root into them if root is not null then remove that node from root into a new treeNode
    type variable and if left part is not null of that var then add the left part into queue and same
    for the right part do it till the queue is not empty.

     */
    public void levelOrder_print(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null)
            q.add(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.remove();
            System.out.print(temp.val + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

/*
Super simply Nothing fancy, First of all declare a Queue data structure of TreeNode type and add root
into them if root is not null then remove that node from root into a new treeNode  type variable and
if left part is not null of that var then add the left part into queue and same for the right part
do it till the queue is not empty.

and for storing in 2d list first 2d list define at the time of queue declaration and inside the while
loop declare a 1d list and also declare a variable in which store queue size till and run a for loop
till the size of the queue and keep adding element into 1d list and outside the for loop that list add
into 2d list again did it queue is not empty and finally returned that 2d list
*/
        if (root == null) {

            return new ArrayList<>();

        }

        List<List<Integer>> list = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            int levelSize = q.size();

            List<Integer> in = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

                TreeNode temp = q.remove();

                in.add(temp.val);

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }

            }

            list.add(in);
        }
        return list;


    }
}
