package solution;

import util.TreeNode;

/**
 * Created by DELL on 2018-06-03.
 */
public class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructSubtree(0, nums.length - 1, nums);
    }

    public TreeNode constructSubtree(int start,int end,int[]nums){

        if(start > end)
            return null;
        int index =start;
        TreeNode root ;
        for(int i = start ;i<=end;i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        root = new TreeNode(nums[index]);
        root.left = constructSubtree(start, index - 1, nums);
        root.right = constructSubtree(index + 1, end, nums);
        return root;

    }

    public static void main(String[] args) {
        Solution654 solution = new Solution654();
        int []nums = {3,2,1,6,0,5};
        TreeNode node =solution.constructMaximumBinaryTree(nums);
        System.out.println("hh");
    }
}
