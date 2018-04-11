package solution;

import util.TreeNode;

/**
 * Created by DELL on 2017-07-14.
 */
public class Solution111 {
    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int leftDepth = minDepth(root.left);
            int rightDepth = minDepth(root.right);
            if (leftDepth > 0 && rightDepth > 0)
                return 1 + (leftDepth > rightDepth ? rightDepth : leftDepth);
            return 1 + (leftDepth < rightDepth ? rightDepth : leftDepth);
        }
    }

    public static void main(String[] args) {
        TreeNode l11 = new TreeNode(2);
        TreeNode l21 = new TreeNode(3);
        TreeNode l22 = new TreeNode(3);
        TreeNode l31 = new TreeNode(6);
        TreeNode l34 = new TreeNode(6);
        l11.left = l21;
        l11.right = l22;
        l21.left = l31;
       // l22.right = l34;
        int result = minDepth(l11);
        System.out.println(result);
    }
}
