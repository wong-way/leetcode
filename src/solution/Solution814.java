package solution;

import util.TreeNode;

/**
 * Created by DELL on 2018-06-10.
 */
public class Solution814 {
    public TreeNode pruneTree(TreeNode root) {
        if (!containOne(root.left))
            root.left = null;
        else{
            pruneTree(root.left);
        }
        if (!containOne(root.right))
            root.right = null;
        else{
            pruneTree(root.right);
        }
        return root;
    }

    /**
     * 判断子树中是否有1
     *
     * @param root 根节点
     * @return 包含1则返回真
     */
    public boolean containOne(TreeNode root) {
        if (root == null)
            return false;
        if (root.val == 1)
            return true;
        return containOne(root.right) || containOne(root.left);
    }
    public TreeNode pruneTree1(TreeNode root) {
       if(root == null)
           return root;
        root.left = pruneTree1(root.left);
        root.right = pruneTree1(root.right);
        if (root.left == null && root.right == null && root.val == 0) return null;
        return root;
    }

}
