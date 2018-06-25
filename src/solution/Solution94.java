package solution;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution94 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }
    private void helper(TreeNode root){
        if(root == null)
            return ;
        helper(root.left);
        result.add(root.val);
        helper(root.right);
    }
}
