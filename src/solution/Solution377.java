package solution;

import java.util.HashMap;
import java.util.Map;

public class Solution377 {
    Map<Integer,Integer> map = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
        int count = 0;
        if(target == 0) return 1;
        else if(target<0) return 0;
        else{
            for(int i = 0 ;i<nums.length;i++){
                int temp;
                if(map.containsKey(i)){
                    temp = map.get(target-nums[i]);
                }else{
                    temp = combinationSum4(nums,target-nums[i]);
                    map.put(target-nums[i],temp);
                }
                count+=temp;
            }
        }
        return count;
    }
}
