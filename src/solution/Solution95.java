package solution;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution95 {

    public List<TreeNode> generateTrees(int n) {

        return helper(generateList(1, n));
    }

    private List<TreeNode> helper(List<Integer> list) {
        List<TreeNode> nodeList = new ArrayList<>();
        if (list.size() == 0) {
            return nodeList;
        }
        for (int i = 0; i < list.size(); i++) {

            List<TreeNode> left = helper(list.subList(0, i));
            List<TreeNode> right = helper(list.subList(i + 1, list.size()));
            if (left.size() != 0 && right.size() != 0) {
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        TreeNode node = new TreeNode(list.get(i));
                        node.left = l;
                        node.right = r;
                        nodeList.add(node);
                    }
                }
            } else if (left.size() != 0) {
                for (TreeNode l : left) {
                    TreeNode node = new TreeNode(list.get(i));
                    node.left = l;
                    node.right = null;
                    nodeList.add(node);
                }
            } else if (right.size() != 0) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(list.get(i));
                    node.left = null;
                    node.right = r;
                    nodeList.add(node);
                }

            } else {
                TreeNode node = new TreeNode(list.get(i));
                nodeList.add(node);
            }
        }
        return nodeList;
    }



    /**
     * 根据传入的参数low,high 生成列表，包含low,包含high
     *
     * @param low  下界
     * @param high 上界
     * @return 生成的列表
     */
    private List<Integer> generateList(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution95 solution95 = new Solution95();
        List<TreeNode> list = solution95.generateTrees(3);
        for (TreeNode node : list) {
            System.out.println(node.val);
        }
    }

}
