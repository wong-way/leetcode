package solution;

/**
 * Created by DELL on 2018-05-03.
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int minLen = Integer.MAX_VALUE;
        int closest=-1;
        for (int i = 1; i < nums.length-1; i++) {
            int sum = nums[i - 1] + nums[i] + nums[i + 1];
            int len = Math.abs(sum-target);
            if(minLen>len) {
                minLen=len;
                closest =sum;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, -1, -1,3};
        Solution16 solution = new Solution16();
        solution.threeSumClosest(arr, 3);
    }
}
