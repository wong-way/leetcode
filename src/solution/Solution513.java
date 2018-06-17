package solution;

import util.TreeNode;

public class Solution513 {
    int depth=5;
    public int findBottomLeftValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (left > right) {
            return findBottomLeftValue(root.left);
        } else return findBottomLeftValue(root.right);


    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
    int ans=0, h=0;
    public int findBottomLeftValue1(TreeNode root) {
        findBottomLeftValue(root, 1);
        return ans;
    }
    public void findBottomLeftValue(TreeNode root, int depth) {

        if (h<depth) {ans=root.val;h=depth;}
        if (root.left!=null) findBottomLeftValue(root.left, depth+1);
        if (root.right!=null) findBottomLeftValue(root.right, depth+1);

    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
//        node5.left = node7;
        Solution513 solution = new Solution513();
        int result = solution.findBottomLeftValue1(node1);

        System.out.println("result = " + result);
    }
}
