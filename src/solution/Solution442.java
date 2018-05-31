package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DELL on 2018-06-01.
 */
public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List list = new ArrayList();
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                list.add(nums[i]);
        }
        return list;
    }

    public List<Integer> findDuplicates1(int[] nums) {
        int[] dict = new int[nums.length];
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (dict[nums[i]] == 0) {
                dict[nums[i]] =1;
            }else {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
