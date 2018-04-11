package solution;


import util.TreeNode;

/**
 * Created by DELL on 2017-07-12.
 */
public class Solution100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSame = false;
        if (p == null && q == null) return true;
        else if (p == null && q != null) return false;
        else if (p != null && q == null) return false;
        if (p.val != q.val)
            isSame = false;
        else
            isSame = ((isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right)));
        return isSame;
    }

    public static void main(String[] args) {
        TreeNode l11 = new TreeNode(2);
        TreeNode l21 = new TreeNode(3);
        TreeNode l22 = new TreeNode(5);
        TreeNode l31 = new TreeNode(6);
        l11.left = l21;
        l11.right = l22;
        l21.left = l31;

        TreeNode n11 = new TreeNode(2);
        TreeNode n21 = new TreeNode(3);
        TreeNode n22 = new TreeNode(5);
        TreeNode n31 = new TreeNode(6);
        n11.left = n21;
        n11.right = n22;
        n21.left = n31;

        boolean isSame = isSameTree(l11, n11);
        System.out.println(isSame);
    }

}
