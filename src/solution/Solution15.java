package solution;

import java.util.*;

/**
 * Created by DELL on 2018-05-23.
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            int pre = i - 1;
            int back = i + 1;
            if (nums[i] > 0 && nums[i] + nums[0] > 0) break;
            if (nums[i] < 0 && nums[i] + nums[nums.length - 1] < 0) break;
            while (pre >= 0 && back < nums.length) {
                if (nums[pre] + nums[i] + nums[back] < 0) {
                    back++;
                } else if (nums[pre] + nums[i] + nums[back] > 0) {
                    pre--;
                } else {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[pre]);
                    l.add(nums[i]);
                    l.add(nums[back]);
                    list.add(l);
                    back++;
                    pre--;
                }
            }

        }

        return (List<List<Integer>>) new ArrayList(new HashSet(list));
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if (nums[0] > 0)
            return list;

        if (nums[nums.length - 1] < 0)
            return list;

        if (nums[0] == 0 && nums[nums.length - 1] == 0)
        {
            List<Integer> l = new ArrayList<>();
            l.add(0);
            l.add(0);
            l.add(0);
            list.add(l);
            return list;
        }
        for (int i = 1; i < nums.length; i++) {
            int pre = i - 1;
            int back = i + 1;
            if (nums[i] > 0 && nums[i] + nums[0] > 0) continue;
            if (nums[i] < 0 && nums[i] + nums[nums.length - 1] < 0) continue;
            while (pre >= 0 && back < nums.length) {
                if (nums[pre] + nums[i] + nums[back] < 0) {
                    back++;
                } else if (nums[pre] + nums[i] + nums[back] > 0) {
                    pre--;
                } else {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[pre]);
                    l.add(nums[i]);
                    l.add(nums[back]);
                    list.add(l);
                    back++;
                    pre--;
                }
            }

        }

        return (List<List<Integer>>) new ArrayList(new HashSet(list));
    }

}
