package solution;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution515 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        getLevelLargest(root, 1);
        return  result;
    }

    private void getLevelLargest(TreeNode node, int level) {
        if (node == null) return ;
        if(level>result.size())
            result.add(node.val);
        else if (node.val > result.get(level - 1)) {
            result.set(level - 1, node.val);
        }
        getLevelLargest(node.left, level + 1);
        getLevelLargest(node.right, level + 1);
    }
}