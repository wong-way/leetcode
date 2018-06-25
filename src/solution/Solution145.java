package solution;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution145 {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }


    private void helper(TreeNode root) {
        if (root == null) return;

        helper(root.left);
        helper(root.right);
        result.add(root.val);
    }

}
