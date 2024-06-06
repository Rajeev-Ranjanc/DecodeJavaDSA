package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Stream;

public class IterativeInOrder {
    public static void main(String[] args) {

    }

    ArrayList<Integer> inOrder(TreeNode root) {
        // Code
        if (root == null) {
            return new ArrayList<>();
        }

        Stack<TreeNode> stack = new Stack<>();

        ArrayList<Integer> list = new ArrayList<>();

        TreeNode temp = root;

        while (true) {

            if (temp != null) {

                stack.push(temp);
                temp = temp.left;

            } else {

                if (stack.isEmpty()) {
                    break;
                }

                TreeNode top = stack.pop();
                list.add(top.val);
                temp = top.right;

            }

        }

        return list;
    }
//    TC : O(n)
//    SC : O(max space of stack)
//

}
