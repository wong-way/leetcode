package solution;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by DELL on 2017-07-13.
 */
public class Solution107 {
    //    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> leftList = new ArrayList<List<Integer>>();
//        List<List<Integer>> rightList = new ArrayList<List<Integer>>();
//        if (root == null)
//            return null;
//        if (root.left != null)
//            leftList.addAll(levelOrderBottom(root.left));
//        if (root.right != null)
//            rightList.addAll(levelOrderBottom(root.right));
//        List<List<Integer>> shorterList= rightList.size()>leftList.size()?leftList:rightList;
//        List<List<Integer>> longerList= rightList.size()<leftList.size()?leftList:rightList;
//        int size = rightList.size()<leftList.size()?leftList.size():rightList.size();
//        for(int i =0;i<size;i++){
//            longerList.get(longerList.size() - 1 - i).addAll(shorterList.get(shorterList.size() - 1 - i));
//        }
//        List<Integer> list = new ArrayList<>();
//        list.add(root.val);
//        longerList.add(list);
//        return longerList;
//    }
    public static void test(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            TreeNode temp = queue.remove();
            System.out.println(temp.val);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);

        }

    }

    public static void main(String[] args) {
        TreeNode l11 = new TreeNode(2);
        TreeNode l21 = new TreeNode(3);
        TreeNode l22 = new TreeNode(3);
        TreeNode l31 = new TreeNode(6);
        TreeNode l34 = new TreeNode(6);
        l11.left = l21;
        l11.right = l22;
        l21.left = l31;
        l22.right = l34;
//        List<List<Integer>> mList = new ArrayList<List<Integer>>();
//        mList = levelOrderBottom(l11);
//        System.out.println(mList.toString());
        test(l11);
    }
}
