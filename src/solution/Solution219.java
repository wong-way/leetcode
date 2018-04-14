package solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by DELL on 2018-04-14.
 */
public class Solution219 {
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]); //remove element if its distance to nums[i] is not lesser than k
            if(!set.add(nums[i])) return true; //because all still existed elements is closer than k distance to the num[i], therefore if the add() return false, it means there's a same value element already existed within the distance k, therefore return true.

        }
        return false;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len ;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.get(num) != null) {
                System.out.println(map.get(num));
                len =i- map.get(num);
                if(len <=k)
                    return true;
                else
                    map.replace(num, map.get(num), i);
            } else
                map.put(num, i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        Solution219 solution = new Solution219();
        if(solution.containsNearbyDuplicate(arr, 1)){
            System.out.println("contains");
        }
    }
}
