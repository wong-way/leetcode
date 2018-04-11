package solution;

import util.TreeNode;

/**
 * Created by DELL on 2017-07-13.
 */
public class Solution104 {
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int left = maxDepth(root.left);
            System.out.println("left = "+left);
            int right = maxDepth(root.right);
            System.out.println("right = "+right);
            return 1+(left>right?left:right);
        }
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(2);
        int depth = maxDepth(root);
        System.out.println(depth);
    }

}
