package solution;

/**
 * Created by DELL on 2017-07-02.
 */
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result={};
        for (int i=0 ; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] temp = {i, j};
                    result = temp;
                    return result;
                }
            }
        }
        return result;
    }
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int []nums = {2, 7, 11, 15};
        int target = 9;
        int []result=twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
