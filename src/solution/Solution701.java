package solution;

import util.TreeNode;

public class Solution701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(val<root.val){
            if(root.left == null) root.left = new TreeNode(val);
            else  insertIntoBST(root.left,val);
        }else{
            if(root.right ==null) root.right = new TreeNode(val);
            else insertIntoBST(root.right,val);
        }
        return root;
    }
}
