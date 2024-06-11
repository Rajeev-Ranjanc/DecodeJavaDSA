package BST;

public class InOrderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode x) {
        //add code here.
        /*
           Inorder is the just greater or equal to the given node.Or in simple words I can say that
           Inorder predecessor is the smallest element which is present in right subtree of a given node.
           For this I have declared a variable of TreeNode type named successor which is gonna to be return
           initialized by null and ran a while loop till root is not null and made a check if root.val < x.val
           means the node will be in the right subtree so made root = root.right else we got find the element which
           is equal to given node(or greater node) then that node would be answer so stored into answer variable and may lesser
           than that value occur and greater than the given node so from this I have called


         */
        TreeNode successor = null;

        while (root != null) {

            if (root.val <= x.val) {

                root = root.right;

            } else {

                successor = root;
                root = root.left;

            }
        }

        return successor;
    }

}
