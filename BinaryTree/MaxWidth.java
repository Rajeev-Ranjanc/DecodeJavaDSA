package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    int getMaxWidth(Node root) {
        // Your code here
        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int ans = Integer.MIN_VALUE;

        while(!q.isEmpty()){

            ans = Math.max(ans , q.size());

            for(int i= 0; i<ans;i++){

                Node temp = q.remove();
                if(temp.left!=null){
                    q.add(temp.left);
                }

                if(temp.right != null ){
                    q.add(temp.right);
                }

            }


        }

        return ans;

    }
}
