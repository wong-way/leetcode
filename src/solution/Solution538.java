package solution;

import util.TreeNode;

public class Solution538 {
    int addNum = 0;
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;

    }
    private void helper(TreeNode root){
        if(root ==null) return;
        helper(root.right);
        int temp ;
        temp = root.val+addNum;
        addNum+=root.val;

        root.val = temp;
        helper(root.left);
    }
}
