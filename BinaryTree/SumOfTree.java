package BinaryTree;

import java.util.Scanner;

public class SumOfTree {
/*
    A lot of question mentioned here
 */
    TreeNode buildTree(TreeNode root) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        root = new TreeNode(data);

        if (data == -1) {
            return null;
        }
        System.out.println("Enter data to insert in left " + root.val);
        root.left = buildTree(root.left);
        System.out.println("enter data to insert at right " + root.val);
        root.right = buildTree(root.right);

        return root;

    }

    public void display(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    //    Calculating the sum of complete tree
    public int sumOfTree(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        sum += sumOfTree(root.left);
        sum += sumOfTree(root.right);
        return sum + root.val;
    }

    //      calculation product of complete tree
    public int productTree(TreeNode root) {

        if (root == null) {
            return 1;
        }

        int pro = 1;
        pro *= productTree(root.left);
        pro *= productTree(root.right);

        return pro * root.val;
    }

    //    Find product of tree of node having 0 as value
    public int productZero(TreeNode root) {

        if (root == null || root.val == 0) {
            return 1;
        }

        return root.val * productZero(root.left) * productZero(root.right);

    }

    //    https://www.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    //    Maximum node of binary tree
    public int findMax(TreeNode root) {
        //code here
        if (root == null) {
            return 0;
        }
        return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));

    }

    //    https://www.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public int findMin(TreeNode root) {
        //code here
        if (root == null) {
            return 0;
        }
        return Math.min(root.val, Math.min(findMin(root.left), findMin(root.right)));
    }


//    https://www.geeksforgeeks.org/problems/size-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static int getSize(TreeNode node) {
        /*
            Nothing fancy just simple traversal to all the nodes of the
            tree and returning the value
         */
        if (node == null) {
            return 0;
        }
        return getSize(node.left) + getSize(node.right) + 1;
    }


    public static void main(String[] args) {
        TreeNode root = null;

        SumOfTree st = new SumOfTree();

//        Display of tree
        st.display(root);

        System.out.println();

//        System.out.println(st.sumOfTree(root));
//        System.out.println(st.productTree(root));
//        System.out.println(st.productZero(root));

//        System.out.println(st.findMax(root));
//        System.out.println(st.findMin(root));

        System.out.println(st.getSize(root));

    }

}
/*
1 41 2 6 20 3 10 5
 */