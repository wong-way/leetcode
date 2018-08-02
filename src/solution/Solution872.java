package solution;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution872{
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        getLeafValue(list1,root1);
        List<Integer> list2 =  new ArrayList<>();
        getLeafValue(list2,root2);
        return isSame(list1,list2);

    }
    private void getLeafValue(List<Integer> list,TreeNode root){
        if(root==null) return;
        if(root.left == null && root.right == null)
            list.add(root.val);
        else
        {
            getLeafValue(list,root.left);
            getLeafValue(list,root.right);
        }

    }
    private boolean isSame(List<Integer> list1,List<Integer> list2){
        if(list1.size()!=list2.size()) return false;
        for(int i = 0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)) return false;
        }
        return true;
    }
}