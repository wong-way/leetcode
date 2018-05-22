package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2018-05-03.
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE+target;
        for (int i = 1; i < nums.length; i++) {
            int temp = getSum(nums, i, target);
            if (Math.abs(temp - target) < Math.abs(result - target)) {
                result = temp;
            }

        }
        return result;

    }

    public int getSum(int[] nums, int index, int target) {
        int i = index-1;
        int j = index+1;
        int sum = Integer.MAX_VALUE+target;
        while (i >= 0 && j < nums.length) {
            int temp = nums[i] + nums[index] + nums[j];
            System.out.println(index + " " + i + " " + j + " " + temp);
            if (Math.abs(temp - target) < Math.abs(sum - target)) {
                sum = temp;
            }
            if (temp > target) {
                i--;
            } else if (temp<target){
                j++;
            }else return target;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,-1,-1,3};
        Solution16 solution = new Solution16();
        System.out.println(solution.threeSumClosest(arr, -1));
    }
}
