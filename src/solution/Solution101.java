package solution;

import util.TreeNode;

/**
 * Created by DELL on 2017-07-13.
 */
public class Solution101 {
    public static boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null)
            return true;
        else if(root.left == null||root.right == null)
            return false;
        if(root.left.val == root.right.val)
            return ((isSymmetric(root.left))&&(isSymmetric(root.right)));
        return false;
    }

    public static void main(String[] args) {
        TreeNode l11 = new TreeNode(2);
        TreeNode l21 = new TreeNode(3);
        TreeNode l22 = new TreeNode(3);
        TreeNode l32 = new TreeNode(6);
        TreeNode l34 = new TreeNode(6);
        l11.left = l21;
        l11.right = l22;
        l21.left = l32;
        l22.right =l34;
        System.out.println(isSymmetric(l11));
    }
}
