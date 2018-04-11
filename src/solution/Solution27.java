package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2017-07-06.
 */
public class Solution27 {
    public static int removeElement(int[] nums, int val) {
        if (nums.length==0)
            return 0;
        Arrays.sort(nums);
        int count =0 ;
        int max = nums[nums.length-1] +1;
        for (int i = 0;i<nums.length;i++) {
            if(nums[i] == val)
            {
                nums[i]=max;
                count++;
            }
        }
        Arrays.sort(nums);
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] test ={3};
        int result = removeElement(test,3);
    }
}
