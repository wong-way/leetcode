package solution;


import util.TreeNode;

/**
 * Created by DELL on 2018-05-07.
 */
public class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode head ;
        if(t1 ==null&&t2==null)
            head = null;
        else if(t1==null)
            head= t2;
        else if(t2==null)
            head= t1;
        else
        {
            head = new TreeNode(t1.val + t2.val);
            head.left = mergeTrees(t1.left, t2.left);
            head.right = mergeTrees(t1.right, t2.right);
        }

        return head;

    }
}
