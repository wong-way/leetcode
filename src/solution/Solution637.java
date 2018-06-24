package solution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution637 {
    static class TreeNode {
        public double val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(double x) {
            val = x;
        }

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
//            result.add(0.0);
            System.out.println(Arrays.toString(result.toArray()));

            return result;
        }
        result.add(new Double(root.val));
        List<Double> left = averageOfLevels(root.left);
        List<Double> right = averageOfLevels(root.right);
        int len = left.size() > right.size() ? right.size() : left.size();
        for (int i = 0; i < len; i++)
            result.add((left.get(i) + right.get(i)) / 2);

        if (left.size() > len)
            for (int i = len; i < left.size(); i++)
                result.add(left.get(i));
        else
            for (int i = len; i < right.size(); i++)
                result.add(right.get(i));

        System.out.println(root.val + ":" + Arrays.toString(result.toArray()));
        return result;


    }

    public static void main(String[] args) {
//        Solution637 solution = new Solution637();
//        TreeNode node1 = new TreeNode(3);
//        TreeNode node2 = new TreeNode(9);
//        TreeNode node3 = new TreeNode(20);
//        TreeNode node4 = new TreeNode(15);
//        TreeNode node5 = new TreeNode(7);
//        node1.left = node2;
//        node1.right = node3;
//        node3.left = node4;
//        node3.right = node5;
//
//        solution.averageOfLevels(node1);
        System.out.println(new Double(2.0));

    }


}
