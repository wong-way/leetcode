package solution;

import util.TreeNode;

public class Solution669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;
        if (root.val <= R && root.val >= L) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        } else if (root.val > R) {
            root = trimBST(root.left, L, R);
        } else {
            root = trimBST(root.right, L, R);
        }
        return root;
    }

    public static void main(String[] args) {
        Solution669 solution = new Solution669();
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(1);
        node1.left=node2;
        node1.right = node3;
        node2.right = node4;
        node4.left = node5;
        TreeNode root = solution.trimBST(node1, 1, 3);

    }
}
