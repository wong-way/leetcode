package solution;

import util.TreeNode;

public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {

        if(root == null) return 0;
        int smallerCount = getTreeCount(root.left);
        if(smallerCount == k-1) return root.val;
        else if(smallerCount > k-1){
            return kthSmallest(root.left,k);
        }else{
            return kthSmallest(root.right,k-1-smallerCount);
        }

    }
    private int getTreeCount(TreeNode root){
        if(root ==null) return 0;
        int count = 1;
        count=count+getTreeCount(root.left)+getTreeCount(root.right);
        return count;
    }
}
