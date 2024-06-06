package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public void display(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public void levelOrderTraversal_(TreeNode root) {

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

    public void nthLevelNode(TreeNode root, int k) {
        helper(root, k, 0);
    }

    private void helper(TreeNode root, int k, int l) {
        if (root == null) {
            return;
        }
        if (k == l) {
            System.out.print(root.val + "  ");
        }
        helper(root.left, k, l + 1);
        helper(root.right, k, l + 1);
    }


    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.left = h;
        g.right = i;

        Traversal tb = new Traversal();
//        tb.display(a);


        System.out.print("PreOrder:");
        tb.preOrder(a);
        System.out.println();

        System.out.print("Inorder:");
        tb.inOrder(a);
        System.out.println();

        System.out.print("PostOrder:");
        tb.postOrder(a);
        System.out.println();

        System.out.println("LevelOrder Traversal:");
        tb.levelOrderTraversal_(a);

        System.out.println();

        System.out.print("NthLevel Order Traversal:");
        tb.nthLevelNode(a, 2);


        System.out.println();
        for (int k = 0; k <=3; k++) {
            tb.nthLevelNode(a,k);
            System.out.println();
        }

    }

}
