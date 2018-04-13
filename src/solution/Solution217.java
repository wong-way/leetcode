package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2018-04-13.
 */
public class Solution217 {
    public boolean containsDuplicate1(int[] nums) {
        if(nums == null || nums.length == 1) return false;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }

        boolean[] bool = new boolean[max - min + 1];
        for(int num : nums){
            if(bool[num - min])
                return true;
            else
                bool[num - min] = true;
        }

        return false;

    }
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++) {
            if(map.containsKey(nums[i]))
                return  true;
            map.put(nums[i], 1);
        }
        return false;
    }
}
